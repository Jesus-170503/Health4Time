/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health4time;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 3PY37LA_RS6
 */
public class Health4Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        List<MedicamentoNuevo> medicamento = new ArrayList<MedicamentoNuevo>();

        String medicamento1 =  JOptionPane.showInputDialog(null,"Introduce el medicamnto");
        String numRefe1 =  JOptionPane.showInputDialog(null,"Introduce el numero de referencia");
        String dosis1 =  JOptionPane.showInputDialog(null,"Introduce la dosis");
        String noTabletas1 =  JOptionPane.showInputDialog(null,"Numero de tabletas");
        String lote1 =  JOptionPane.showInputDialog(null,"Introduce el lote");
        String fechaEmi1 =  JOptionPane.showInputDialog(null,"Introduce la fecha de emision");
        String fechaExpi1 =  JOptionPane.showInputDialog(null,"Introduce la fecha de expiracion ");
        String dosisDiaria1 =  JOptionPane.showInputDialog(null,"Introduce la dosis diaria");
        String eSecun1 =  JOptionPane.showInputDialog(null,"Introduce el efecto secundario");
        String masInfo1 =  JOptionPane.showInputDialog(null,"Introduce mas informacion");
        String avisoAlm1 =  JOptionPane.showInputDialog(null,"Introduce cuantas piezas se tienen");
        String manejoMa1 =  JOptionPane.showInputDialog(null,"¿Manejo o uso de maquinas");
        String manejoMedi1 =  JOptionPane.showInputDialog(null,"Manejo de medicamento");
        
        medicamento.add(new MedicamentoNuevo(medicamento1,numRefe1,dosis1,noTabletas1, lote1, fechaEmi1,
                fechaExpi1, dosisDiaria1, eSecun1, masInfo1, avisoAlm1,manejoMa1, manejoMedi1 ));
       

        for (int i = 0; i < medicamento.size(); i++) {
            System.out.println(medicamento.get(i).getMedicamento());
        }

    }

}

/*class MedicamentoNuevo {

    private String medicamento;
    private String numRefe;
    private String dosis;
    private String noTabletas;
    private String lote;
    private String fechaEmi;
    private String fechaExpi;
    private String dosisDiaria;
    private String eSecun;
    private String masInfo;
    private String avisoAlm;
    private String manejoMa;
    private String manejoMedi;

    public MedicamentoNuevo(String medicamento, String numRefe, String dosis, String noTabletas, String lote, String fechaEmi, String fechaExpi, String dosisDiaria, String eSecun, String masInfo, String avisoAlm, String manejoMa, String manejoMedi) {
        this.medicamento = medicamento;
        this.numRefe = numRefe;
        this.dosis = dosis;
        this.noTabletas = noTabletas;
        this.lote = lote;
        this.fechaEmi = fechaEmi;
        this.fechaExpi = fechaExpi;
        this.dosisDiaria = dosisDiaria;
        this.eSecun = eSecun;
        this.masInfo = masInfo;
        this.avisoAlm = avisoAlm;
        this.manejoMa = manejoMa;
        this.manejoMedi = manejoMedi;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public String getNumRefe() {
        return numRefe;
    }

    public String getDosis() {
        return dosis;
    }

    public String getNoTabletas() {
        return noTabletas;
    }

    public String getLote() {
        return lote;
    }

    public String getFechaEmi() {
        return fechaEmi;
    }

    public String getFechaExpi() {
        return fechaExpi;
    }

    public String getDosisDiaria() {
        return dosisDiaria;
    }

    public String geteSecun() {
        return eSecun;
    }

    public String getMasInfo() {
        return masInfo;
    }

    public String getAvisoAlm() {
        return avisoAlm;
    }

    public String getManejoMa() {
        return manejoMa;
    }

    public String getManejoMedi() {
        return manejoMedi;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public void setNumRefe(String numRefe) {
        this.numRefe = numRefe;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setNoTabletas(String noTabletas) {
        this.noTabletas = noTabletas;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setFechaEmi(String fechaEmi) {
        this.fechaEmi = fechaEmi;
    }

    public void setFechaExpi(String fechaExpi) {
        this.fechaExpi = fechaExpi;
    }

    public void setDosisDiaria(String dosisDiaria) {
        this.dosisDiaria = dosisDiaria;
    }

    public void seteSecun(String eSecun) {
        this.eSecun = eSecun;
    }

    public void setMasInfo(String masInfo) {
        this.masInfo = masInfo;
    }

    public void setAvisoAlm(String avisoAlm) {
        this.avisoAlm = avisoAlm;
    }

    public void setManejoMa(String manejoMa) {
        this.manejoMa = manejoMa;
    }

    public void setManejoMedi(String manejoMedi) {
        this.manejoMedi = manejoMedi;
    }

}*/
