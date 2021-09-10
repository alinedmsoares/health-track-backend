package br.com.fiap.healthtrack;

public class Pessoa {

	public Pessoa() {
	}

	public static void main(String[] args) {
	
	}	
		
	// Classe Pessoa //

	
		public static final long serialVersionUID = 1L;
			private String idPessoa;
			private String name;
			private String birthdate;
			private String genre;
			private String email;
			private String password;
			private String function;
			private String entity;
					
		public Pessoa(String idPessoa, String name, String birthdate, String genre, String email, String password,
							String function, String entity) {
			super();
			this.idPessoa = idPessoa;
			this.name = name;
			this.birthdate = birthdate;
			this.genre = genre;
			this.email = email;
			this.password = password;
			this.function = function;
			this.entity = entity;
    }
						
					
				public void login(String idPessoa, String password) {
						
					this.idPessoa = "569875";
					this.password = "123Abc";
								
					if(idPessoa == this.idPessoa && password == this.password) {
							
							System.out.println("Login válido");
						} else {
							
							System.out.println("Login inválido");
						}
				}
				               
				// get - set //
				
						public String getIdPessoa() {
							return idPessoa;
						}
						public void setIdPessoa(String idPessoa) {
							this.idPessoa = idPessoa;
						}


				        public String getName() {
					        return name;
				        }
				        
				        public void setName(String name) {
				        	this.name = name;
				        }
				        public String getBirthdate() {
				    		return birthdate;
				    	}
				           	public void setBirthdate(String birthdate) {
				    		this.birthdate = birthdate;
				    	}
				    	    	
				        	public String getGenre() {
				    		return genre;
				    	}
				    	
				    	public void setGenre(String genre) {
				    	this.genre = genre;
				    	}
				    	    	     	
				        public String getEmail() {
				    	  return email;
				    	}
				    	
				    	public void setEmail(String email) {
				    		this.email = email;
				    	}
				    	
				    	
				    	public String getPassword() {
				    	return password;
				    	}
				    	
				    	public void setPassword(String password) {
				    		this.password = password;
				    	}
				    	
				    	public String getFunction() {
				    		return function;
				    		
				    }
				    	public void setFunction(String function) {
				    		this.function = function;
				    	}
				    	
				    	public String getEntity() {
				    		return entity;
				    	}
				    	public void setEntity(String entity) {
				    		this.entity = entity;
				    	}

				
			}

		

	


