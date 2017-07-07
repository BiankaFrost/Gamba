int a,b,c,x=0,y=1,z,w=0,soma, i=0, g=0, base, n;

    while ( a<4 ) {

    

    System.out.print ("Apresentar os números da série Fibonacci=====1\n");

    System.out.print ("Apresentar números primos====2\n");

    System.out.print ("Apresentar números perfeitos====3\n");    

    System.out.print ("Sair do Programa====4\n");     

           	String oqOUsuarioDigitar = JOptionPane.showInputDialog("Confirme sua opção");

               	a = Integer.parseInt(oqOUsuarioDigitar);

    	scanf("%d", &a);

    	char umChair = oqOUsuarioDigitar.charAt(0);

    if ( a==1 ) {

    System.out.print ("Fala ae o Intervalo, de 0 a algum número:\n");

    scanf ("%d", &c);

    while (soma<=c){

    soma=x+y;

    	x=y;

    	y=soma;

    System.out.print ("%d\n",soma);

    soma++;

    if (soma>=c) {

return 0;

   	  	}

              	}

   	 	}

   	 

    

    if ( a==2 ) {

i=3;

    System.out.print ("Digite o número:");

    scanf ("%d", &b);

    for ( soma = 2; soma <= b;) {

   	 for ( x = 2 ; x <= i - 1 ; x++ ){

    	if ( i%x == 0 ) {

        	break;

  	}

  	if ( x == i ){

     	System.out.print (i + "\n");

     	System.out.print ("O valor de i é" + i);

     	System.out.print("i é" + i +"! =D\n");

     	System.out.print (i + "," + a);

     	soma++;

    	 

}

  	++;

  }    

}    

    }

    if ( a==3 ) {

i=0;

    System.out.print ("digite:");

    scanf ("%d", &n);

    for(i=1; i<=n; i++)  {

    	soma = 0;

    	for(x=1; x<i; x++)  {

        	if(i%x==0) {

            	soma += x;

      		  }

  	}

 

    	if(soma == i) {

{

        	System.out.println(soma + );

  }

   }

    }

}

}

return 0;


