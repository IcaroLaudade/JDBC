/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.metodista.dao;

import br.com.metodista.bo.Teste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class TesteDAO implements IDAOBase<Teste> {

    ConexaoBanco conn;

    public TesteDAO() {
        conn = new ConexaoBanco();
    }

    @Override
    public void save(Teste teste) {
        try {
            String inserir = "insert into jdbc(codigo,nome,numero,decimo) values (?,?,?,?)";
            Connection cone = conn.conectar();
            PreparedStatement ps = cone.prepareStatement(inserir);
            ps.setInt(1, teste.getCodigo());
            ps.setString(2, teste.getNome());
            ps.setInt(3, teste.getNumero());
            ps.setDouble(4, teste.getDecimal());
            ps.execute();
            cone.close();
        } catch (SQLException sq) {
            System.out.println(sq);
        }
    }

    @Override
    public Teste find(int codigo) {
        Teste teste = new Teste();
        try {
            String consultar = "select * from jdbc where codigo=?";
            Connection cone = conn.conectar();
            PreparedStatement ps = cone.prepareStatement(consultar);
            ps.setInt(1, codigo);
            ResultSet set = ps.executeQuery(consultar);
            while (set.next()) {
                teste.setCodigo(set.getInt("codigo"));
                teste.setNome(set.getString("nome"));
                teste.setCodigo(set.getInt("numero"));
                teste.setDecimal(set.getDouble("decimo"));
            }
            return teste;
        } catch (SQLException sq) {
            System.out.println(sq);
        }
        return teste;
    }

    @Override
    public List<Teste> list() {
        List<Teste> lista = new ArrayList<>();
        Teste teste = new Teste();
        try {
            String consultar = "select * from jdbc";
            Connection cone = conn.conectar();
            PreparedStatement ps = cone.prepareStatement(consultar);
            ResultSet set = ps.executeQuery(consultar);
            while (set.next()) {
                teste.setCodigo(set.getInt("codigo"));
                teste.setNome(set.getString("nome"));
                teste.setCodigo(set.getInt("numero"));
                teste.setDecimal(set.getDouble("decimal"));
                lista.add(teste);
            }
            return lista;
        } catch (SQLException sq) {
            System.out.println(sq);
        }
        return lista;
    }

    @Override
    public void update(Teste teste) {
        try {
            String update = "update jdbc set codigo=?,nome=?,numero=?,decimo=?";
            Connection cone = conn.conectar();
            PreparedStatement ps = cone.prepareStatement(update);
            ps.setInt(1, teste.getCodigo());
            ps.setString(2, teste.getNome());
            ps.setInt(3, teste.getNumero());
            ps.setDouble(4, teste.getDecimal());
            ps.executeUpdate();
            cone.close();
        } catch (SQLException sq) {
            System.out.println(sq);
        }
    }

    @Override
    public void delete(Teste teste) {
        try {
            String delete = "delete from jdbc where codigo=?";
            Connection cone = conn.conectar();
            PreparedStatement ps = cone.prepareStatement(delete);
            ps.setInt(1, teste.getCodigo());
            ps.execute();
            cone.close();
        } catch (SQLException erro) {
            System.out.println(erro);
        }
    }
}
