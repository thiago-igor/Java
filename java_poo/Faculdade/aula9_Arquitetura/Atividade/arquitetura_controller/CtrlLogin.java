package java_poo.Faculdade.aula9_Arquitetura.Atividade.arquitetura_controller;

import java_poo.Faculdade.aula9_Arquitetura.Atividade.arquitetura_model.LoginBean;
import java_poo.Faculdade.aula9_Arquitetura.Atividade.arquitetura_model.LoginDAO;

public class CtrlLogin {
	
	public static boolean login(LoginBean loginBean) throws Exception {
		// Verificação simples
		if (loginBean.getUser().isEmpty() || loginBean.getPassword().isEmpty())
			return false;
		// Validar usuário e senha
		LoginDAO loginDAO = new LoginDAO();
		return loginDAO.authenticateUser(loginBean);
	}

}