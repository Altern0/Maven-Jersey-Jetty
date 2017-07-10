package com.javarevolution.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javarevolution.ws.rest.vo.VOUsuario;

@Path("/javaRevolution")
public class ServiceLoginJR
{
	@POST      //tipo de m�todo
	@Path ( "/validarUsuario" )   // nombre del m�todo
	@Consumes ( { MediaType.APPLICATION_JSON } )   // que consume el m�todo
	@Produces ( { MediaType.APPLICATION_JSON } )   // que produce el m�todo
	public VOUsuario validarUsuario( VOUsuario vo ){
		
		vo.setUserValid( false );
		
		if ( vo.getUsuario().equals( "java" ) && vo.getPassword().equals( "revolution" ) ){
			
			vo.setUserValid( true );
			
		}
		
		return vo;
	}
	
    @GET
    @Path("/msg")
    public String getMsg()
    {
         return "Hello World !! - Jersey 2 RestJR";
    }

}

