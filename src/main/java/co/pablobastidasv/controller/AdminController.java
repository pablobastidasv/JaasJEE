package co.pablobastidasv.controller;

import co.pablobastidasv.boundary.ClienteBoundary;

import javax.ejb.EJBAccessException;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 * Created by pbastidas on 31/03/15.
 */
@Model
public class AdminController {

	@Inject
	ClienteBoundary clienteBoundary;

	public void crearCliente() {
		clienteBoundary.crearCliente();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Llamado correctamente ejecutado", ""));

	}

	public void crearCliente2() {
		try {
			clienteBoundary.crearCliente2();
		} catch (EJBAccessException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage()));
		}

	}
}
