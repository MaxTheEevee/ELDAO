/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Erik
 */
public class DAOautor {
    private String _VCH_NOMBRE_AUTOR;

    public String getVCH_NOMBRE_AUTOR() {
        return _VCH_NOMBRE_AUTOR;
    }

    public void setVCH_NOMBRE_AUTOR(String _VCH_NOMBRE_AUTOR) {
        this._VCH_NOMBRE_AUTOR = _VCH_NOMBRE_AUTOR;
    }

    public DAOautor() {
        
    }
    
    public DAOautor(String _VCH_NOMBRE_AUTOR) {
        this._VCH_NOMBRE_AUTOR = _VCH_NOMBRE_AUTOR;
    }
    public Boolean ValidaSubida( String nom){
        Boolean flag = true;
        if(!nom.isEmpty()){ setVCH_NOMBRE_AUTOR(nom); }else{return false;}
        
        return flag;
    }
    
    
}
