grammar fupl;

@header { import java.util.*; }

@members {
	Variavel x = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String saida = "";
	int escopo;
	int tipo;
	int tmp = 0;
	String nid, idO;
	Scanner entrada = new Scanner(System.in);
}

inicio: {
		 escopo = 0;
		 saida += "public class Saida{\n\t";
		}
		declvar 'inicio' {
						  escopo = 1;
						  saida += "\n\tpublic static void main(String args[]){\n\n\t\tScanner entrada = new Scanner(System.in);\n\t\t";
						 }
			declvar cmd 'fim' {
							   saida += "\n\t}\n}"; 
							   System.out.println(saida);
							  };

declvar: (tipo ID {
				   x = new Variavel($ID.text, tipo, escopo);
				   boolean ret = cv.adiciona(x);
				   if(!ret){
						    System.out.println("\nFeUmb adverte: variável " + $ID.text + " já foi declarada!");
							System.exit(0);
						   }
				  }
		  PV { saida += $ID.text + ";\n\t\t";})*;

tipo: ('feumb_natural' {tipo = 0; saida += "int ";} | 'feumb_letra' {tipo = 1; saida += "char ";} | 'feumb_real' {tipo = 2; saida += "double ";});

cmd: (cond | atrib | enquanto | fazer | saida | texto | entrada)*;

cond: 'se' {saida += "\n\t\tif ";} AP {saida += "(";} comp {saida += $comp.text;} FP {saida += ")"; } AC {saida += "{\n\t\t\t"; } cmd FC {saida += "\n\t\t}";}
	('senao' {saida += " else "; } AC {saida += "{\n\t\t\t";} cmd FC {saida += "\n\t\t}"; })?;

enquanto: 'enquanto' {saida += "\n\t\twhile ";} AP {saida += "(";} comp {saida += $comp.text;} FP {saida += ")";} AC {saida += " {\n\t\t\t";} cmd FC {saida+="\n\t\t}";};

fazer: 'fazer' {saida += "\n\t\tdo ";} AC {saida += "{\n\t\t\t";} cmd FC {saida += "\n\t\t}";}
	'durante' {saida += " while ";} AP {saida += "(";} comp {saida += $comp.text;} FP {saida += ")";} PV {saida += ";";};

comp: texto OPREL texto;

saida: 'imprime' {saida += "\nSystem.out.println";} 
	AP {saida += "(";}
	(ASDUPLA texto {saida += $texto.text;} ASDUPLA
	(OP_SOMAC {saida += "+";} (ID {saida += $ID.text;} | ASDUPLA texto {saida += $texto.text;} ASDUPLA))*
	| ID {saida += $ID.text;} (OP_SOMAC{saida += "+";} (ID {saida += $ID.text;} | ASDUPLA texto {saida += $texto.text;} ASDUPLA))*
	FP {saida += ");";})PV;

entrada: 'entrada('ID')' {saida += "\n\t\t" + $ID.text + " = entrada.next";} {
																	String nid = $ID.text;
																	x = cv.busca(nid);
																	if(x == null){
																				  System.out.println("\nFeUmb adverte: variável " + $ID.text + " não foi declarada!");
																				  System.exit(0);
																   } else {
																		   tmp = x.getTipo();
																		  }
																	if(tmp == 0){
																				 {saida += "Int()";}
																				} else if(tmp == 1){
																								    {saida+="().charAt(0)";}
																								   } else if(tmp == 2){
																													   {saida += "Double()";}}
																													  }
																	PV{saida+=";";};

atrib: ID {
		   String nid = $ID.text;
		   idO = nid;
		   x = cv.busca(nid);
		   if(x == null){
						 System.out.println("\nFeUmb adverte: variável "+ $ID.text + " não foi declarada!");
						 System.exit(0);
						} else {
								tmp = x.getTipo();
								saida += nid;
							  ;}
		  } Op_atrib {saida += " = ";} (ID {
										  nid = $ID.text;
										  x = cv.busca(nid);
										  if(x == null){
														System.out.println("\nFeUmb adverte: variável " + $ID.text + " não foi declarada!");
														System.exit(0);
													   } else {
															   if(x.getTipo() == tmp){
																					  saida += x.getNome() + "\n";
																					 } else {
																							 System.out.println("\nFeUmb adverte: variáveis " + $ID.text + " e "
																							 + idO + " são diferentes!");
																							 System.exit(0);
																							}
															 ;}
										 } | NUM {
												  if(tmp == 0){
															   saida += $NUM.text;
																if($NUM.toString().contains(".")){
																								  System.out.println("\nFeUmb adverte: número " + $NUM.text + " e variável "
																								  + idO + " são de tipos diferentes!");
																								  System.exit(0);
																								 }
															} else {
																	saida += $NUM.text;
																   }
												 }
) (op_aritmetico {saida += $op_aritmetico.text;} (ID {
													  nid = $ID.text;
													  x = cv.busca(nid);
													  if(x == null){
																	System.out.println("\nFeUmb adverte: variável " + $ID.text + " não foi declarada!");
																	System.exit(0);
																   } else {
																		   if(x.getTipo() == tmp){
																								  saida += x.getNome();
																								 } else {
																										 System.out.println("\nFeUmb adverte: variáveis " + $ID.text + " e "
																										 + idO + " sao diferentes!");
																										 System.exit(0);
																										}
																		 ;}
													 } | NUM {
															  int tiponum;
															  if(tmp == 0){
																		   saida += $NUM.text;
																		   if($NUM.toString().contains(".")){
																											 System.out.println("\nFeUmb adverte: número " + $NUM.text + " e variável "
																											 + idO + " são de tipos diferentes!");
																											} else {
																													saida += $NUM.text;
																												   }
																		  } else {
																				  saida += $NUM.text;
																				 }
															 }))*{saida += ";";} PV;

expressao: (ID {
				String nid = $ID.text;
				x = cv.busca(nid);
				if(x == null){
							  System.out.println("\nFeUmb adverte: variável " + $ID.text + " não foi declarada!");
							  System.exit(0);
							 } else {
									 tmp = x.getTipo();
								   ;}
			   } | NUM) (op_aritmetico (ID {
											nid = $ID.text;
											x = cv.busca(nid);
											if(x == null){
														  System.out.println("\nFeUmb adverte: variável " + $ID.text + " não foi declarada!");
														  System.exit(0);
														 } else {
																 if(x.getTipo() != tmp){
																						System.out.println("\nFeUmb adverte: variáveis " + $ID.text + " e "
																						+ x.getNome() + " são de tipos diferentes!");
																						System.exit(0);
																					   }
															   ;}
										   } | NUM))* PV;

op_aritmetico: '+' | '-' | OP_ARITMETICO2;

texto: (ID | NUM)+;






ID: [A-Za-z]+;

ASDUPLA: '"';

OP_SOMAC: '@';

OP_ARITMETICO2:'/' | '*';

NUM:[0-9]+ ('.'  [0-9]+)?;

OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=';

PV: ';';

AC: '{';

FC: '}';

AP: '(';

FP: ')';

Op_atrib: '=';

WS: [ \t\r\n]+ -> skip;