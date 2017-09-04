package br.selenium.param;

public class CadastroParam {
    private String nome;
    private String email;
    private String telefone;
    private String end;
    private String estado;
    private String cidade;
    private String escola;
    private String calendario;
    private String horario;
    
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
    this.nome= nome;
    }
    public String getEmail(){
    return email;
    }
    public void setEmail(String email){
    this.email = email;
    }
    public String getTel(){
    	return telefone;
    }
    public void setTel(String telefone){
    	this.telefone = telefone;
    }
    public String getEnd(){
    	return end;
    }
    public void setEnd(String end){
    	this.end= end;
    }
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
}
	public String getCalendario(){
		return calendario;
	}
	public void setCalendario(String calendario){
		this.calendario = calendario;
	}
	public String getHorario(){
		return horario;
	}
	public void setHorario(String horario){
		this.horario = horario;
	}
	
	}