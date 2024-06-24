package com.eleodoro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Equipamentos;

    
public class EquipamentosDao{

    private Equipamentos Equipamentos;
    private final String SQLINCLUIR = "INSERT INTO EQUIPAMENTOS VALUES (?, ?, ?)";
    private final String SQLALTERAR = "UPDATE EQUIPAMENTOS SET NOME = ?, SETOR = ? WHERE ID = ?";
    private final String SQLEXCLUIR = "DELETE FROM EQUIPAMENTOS WHERE ID = ?";
    private final String SQLCONSULTAR = "SELECT * FROM EQUIPAMENTOS WHERE ID = ?";

    public EquipamentosDao (Equipamentos equipamentos) {
        this.Equipamentos = equipamentos;
    }

    public boolean incluir(){
         try {
            PreparedStatement ps = Conexao.getConexao () .PreparedStatement(SQLINCLUIR);
            ps.setInt(1, Equipamentos.getId());
            ps.setString(2, Equipamentos.getNome());
            ps.setSetor(3, Equipamentos.getSetor());
            ps.setString(4, Equipamentos.getMarca());
            ps.executeUpdate();
            return true;
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir o equipamento");
            return false;
         }
    }

    public boolean alterar(){
        try {
           PreparedStatement ps = Conexao.getConexao () .PreparedStatement(SQLALTERAR);
           ps.setInt(1, Equipamentos.getId());
           ps.setString(2, Equipamentos.getNome());
           ps.setSetor(3, Equipamentos.getSetor());
           ps.setString(4, Equipamentos.getMarca());
           ps.executeUpdate();
           return true;
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar o equipamento");
           return false;
        }
   }

   public boolean excluir(){
    try {
       PreparedStatement ps = Conexao.getConexao () .PreparedStatement(SQLEXCLUIR);
       ps.setInt(1, Equipamentos.getId());
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel excluir o equipamento");
       return false;
    }
}

public boolean consultar(){
    try {
       PreparedStatement ps = Conexao.getConexao () .PreparedStatement(SQLCONSULTAR);
       ps.setInt(1, Equipamentos.getId());
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
        Equipamentos.setNome(rs.getString(2));
        Equipamentos.setSetor(rs.GetSetor(3))
       }
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel consultar o equipamento");
       return false;
    }
}
}
    
