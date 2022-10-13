package Capitulo4.EqualsHashCode;

import java.util.Date;

public class Equals
{
    @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
    {
        Usuario u1 = new Usuario();
        u1.nome = "Ralph Rebello";
        u1.email = "ralph.rebello8@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Ralph Rebello";
        u2.email = "ralph.rebello8@gmail.com";

        //nao se usa == para comparar objetos
        System.out.println(u1 == u2);

        //usar sempre o equals e dentro da classe 'Usuario' usar o equals
        //o hashcode
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        //aqui da falso pq na classe 'Usuario' tem um if testando se o obj
        //foi criado pela classe 'Usuario'
        System.out.println(u2.equals(new Date()));
    }
}
