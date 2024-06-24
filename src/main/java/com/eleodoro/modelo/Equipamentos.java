package com.eleodoro.modelo;

public class Equipamentos {
    

    private String nome;
    private setor setor;
    private int id;
    private String marca;
   
   
    public Equipamentos() {
    }


    public Equipamentos(String nome, com.eleodoro.modelo.setor setor, int id, String marca) {
        this.nome = nome;
        this.setor = setor;
        this.id = id;
        this.marca = marca;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public setor getSetor() {
        return setor;
    }


    public void setSetor(setor setor) {
        this.setor = setor;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Equipamentos [nome=" + nome + ", setor=" + setor + ", id=" + id + ", marca=" + marca + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((setor == null) ? 0 : setor.hashCode());
        result = prime * result + id;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipamentos other = (Equipamentos) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (setor == null) {
            if (other.setor != null)
                return false;
        } else if (!setor.equals(other.setor))
            return false;
        if (id != other.id)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

    
    

}
