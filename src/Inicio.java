import java.sql.Date;

import org.hibernate.Session;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Empresa empresa = new Empresa();
		Item item = new Item();
		Item item2 = new Item();
		Pedido pedido = new Pedido();
		
		
		
		item.setNombre("Palo");
		item.setCantidad(200);
		
		item2.setNombre("Palo2");
		item2.setCantidad(2000);
		
		java.util.Date utilDate = new java.util.Date(); //fecha actual
		long lnMilisegundos = utilDate.getTime();
		Date fecha = new Date(lnMilisegundos);
		pedido.setFecha(fecha);
		pedido.getItems().add(item2);
		pedido.getItems().add(item);
		
		empresa.setCif("12345");
		empresa.getDireccion().setCalle("Perez Galdos");
		empresa.getDireccion().setPoblacion("Lliria");
		empresa.getDireccion().setCp(20010);
		empresa.setEmpleados(200);
		empresa.setNombre("Bollicao");
		
		empresa.addPedido(pedido);
		
		
		session.save(empresa);
		//session.save(pedido);
		//session.save(item);
	
		session.getTransaction().commit();
		
		session.beginTransaction();
		
		Empresa empresaRecuperada = session.get(Empresa.class,"12345");
		System.out.println("empresa recuperada con cif "+empresaRecuperada.getCif()+" con nombre "+empresaRecuperada.getNombre());
				
		Pedido pedidoRecuperado = session.get(Pedido.class, 1);
		
		for(Item itemRecuperado : pedidoRecuperado.getItems()){
			System.out.println("Recuperado "+itemRecuperado.getNombre());
		}
		
		session.close();

		HibernateUtilities.getSessionFactory().close();


	}

}
