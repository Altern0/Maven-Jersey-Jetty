package com.javarevolution.ws.rest.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.javarevolution.ws.rest.vo.VOUsuario;


public class RestClientJR {

	public static void main( String[] arg ){
	
		VOUsuario vo = new VOUsuario();
		
		vo.setUsuario( "java" );
		vo.setPassword( "revolution" );
		
		// instanciamos un cliente con el método ClientBuilder
		Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
		
		//Pasamos por parámetros la dirección de nuestro servicio para comunicarnos con el servicio mediante el Objeto WebTaget
		WebTarget webTarget = client.target("http://localhost:8080/RestJR/rest").path("javaRevolution").path("validarUsuario");
		 
		//realizamos la solicitud y le decimos es JSON llamamos al método le pasamos por parámetros el objeto creado,
		// el tipo que recibe el método (en nuestro caso JSON) para que la API serialice antes de llamarlo y darnos la respuesta
		Invocation.Builder invocationBuilder =  webTarget.request( MediaType.APPLICATION_JSON );
		Response response = invocationBuilder.post( Entity.entity( vo, MediaType.APPLICATION_JSON) );
		 
		//para pasarlo del JSON al Objeto creado usamos readEntity y pasamos el .class de la clase del objeto
		vo = response.readEntity( VOUsuario.class );
		     
		System.out.println();

		System.out.println( vo.getUsuario() );
		System.out.println( vo.getPassword());
		System.out.println( vo.isUserValid() );


		
	}
	
} 