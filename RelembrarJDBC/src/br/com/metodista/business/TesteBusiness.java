/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.metodista.business;

import br.com.metodista.bo.Teste;
import br.com.metodista.dao.TesteDAO;
import java.util.List;
import br.com.metodista.dao.IDAOBase;

/**
 *
 * @author Icaro
 */
public class TesteBusiness {

    IDAOBase tes = new TesteDAO();

    public void save(Teste teste) {
        try {
            tes.save(teste);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Teste teste) {
        try {
            tes.update(teste);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete(Teste teste) {
        try {
            tes.delete(teste);
        } catch (Exception e) {
        System.out.println(e);
        }
    }

    public Teste find(int codigo) {
        try {
            return (Teste) tes.find(codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Teste> list() {
        try {
            return tes.list();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
