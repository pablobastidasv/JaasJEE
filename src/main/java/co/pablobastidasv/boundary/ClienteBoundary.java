package co.pablobastidasv.boundary;

import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Created by pbastidas on 31/03/15.
 */
@Stateless
@DeclareRoles({"ROL_PRESTADOR"})
@DenyAll
public class ClienteBoundary {

	@Resource
	SessionContext ctx;

	@RolesAllowed("ROL_PRESTADOR")
	public void crearCliente() {
		System.out.println("Crear cliente " + ctx.getCallerPrincipal().getName());
	}

	public void crearCliente2() {
		System.out.println("Crear cliente 2 " + ctx.getCallerPrincipal().getName());
	}

}
