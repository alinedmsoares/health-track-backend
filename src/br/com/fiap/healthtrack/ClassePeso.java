package peso;
import java.util.Date;

public class ClassePeso {

private double peso; 
private int idPeso;
private Date dtPesagem;

public int getIdPeso() {
	return idPeso;
}
public void setIdPeso(int idPeso) {
	this.idPeso = idPeso;
}
public double getPeso() {
	return peso;
		
}
public Date getDtPesagem() {
	return dtPesagem;
}
public void setDtPesagem(Date dtPesagem) {
	this.dtPesagem = dtPesagem;
}
}