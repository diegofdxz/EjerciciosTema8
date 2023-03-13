/*



class Cliente {
        private String nombre;
        private int numeroDeCliente;
        private static int contador = 0;

        public Cliente(String nombre) {
            this.nombre = nombre;
            this.numeroDeCliente = ++contador;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumeroDeCliente() {
            return numeroDeCliente;
        }
    }

    public void crearCliente(ArrayList<Cliente> clientes){


        System.out.println("¿Nombre?");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(nombre);
        clientes.add(cliente);
        System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "] añadido");

    }

 public void mostrarClientes(ArrayList<Cliente> clientes) {
        System.out.println("-- Clientes --");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "]");
        }
    }

    Los clientes creados en el capítulo anterior, pueden comprar libros y vídeos a nuestro editor. Todos los libros y vídeos tienen un título y un autor. Un libro tiene varias páginas, mientras que un vídeo tiene una duración. Crear una clase Obra, agrupando los elementos comunes a libros y vídeos y dos clases Libros y Video, herederas de esta, con los elementos específicos para cada una. Luego cree una clase Pedido, asociando a un cliente un conjunto de obras compradas.

Ejemplo de ejecución posible:

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

2

¿Nombre?

Francisco GONZALEZ

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

2

¿Nombre?

Carlota OLIVERA

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

3

¿Tipo?

1 - Libro

2 - Vídeo

2

¿Título?

Java avanzado

¿Autor?

Thierry RICHARD

¿Duración (minutos)?

378

Vídeo Java avanzado de Thierry RICHARD (6h18) añadido

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

3

¿Tipo?

1 - Libro

2 - Vídeo

1

¿Título?

Java : Los fundamentos del lenguaje Java

¿Autor?

Thierry GROUSSARD

¿Número de páginas?

501

Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas) añadido

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

4

¿Para qué cliente?

Cliente n°.1: Francisco GONZALEZ

Cliente n°.2: Carlota OLIVERA

2

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

2

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

1

¿Qué obra agregar al pedido?

1 - Vídeo Java avanzado de Thierry RICHARD (6h18)

2 - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

3 - Terminar pedido

3

-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

5

-- Pedidos --

 * Pedido de: Carlota OLIVERA:

    - Libro Java: Los fundamentos del lenguaje Java de Thierry GROUSSARD (501 páginas)

    - Vídeo Java avanzado de Thierry RICHARD (6h18)



-- Menú --

1 - Mostrar clientes

2 - Crear clientes

3 - Crear una obra

4 - Crear un pedido

5 - Mostrar pedidos

6 - Salir

6
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ej2 {



    class Cliente{
        String nombre;
        int numeroDeCliente;
        static int contador = 0;

        public Cliente(String nombre, int numeroDeCliente) {
            this.nombre = nombre;
            this.numeroDeCliente = numeroDeCliente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumeroDeCliente() {
            return numeroDeCliente;
        }

        public void setNumeroDeCliente(int numeroDeCliente) {
            this.numeroDeCliente = numeroDeCliente;
        }
        public void crearCliente(ArrayList<Cliente> clientes){
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Nombre?");
            String nombre = sc.nextLine();
            Cliente cliente = new Cliente(nombre, contador);
            contador++;
            clientes.add(cliente);
            System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "] añadido");
        }
        public static void mostrarClientes(ArrayList<Cliente> clientes){
            for (Cliente cliente : clientes) {
                System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "]");
            }
        }
    }
    class Obra{
        ArrayList<Obra> obras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String titulo;
        String autor;

        public Obra(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

    }
    class Libro extends Obra{
        int numeroDePaginas;

        public Libro(String titulo, String autor, int numeroDePaginas) {
            super(titulo, autor);
            this.numeroDePaginas = numeroDePaginas;
        }

        public int getNumeroDePaginas() {
            return numeroDePaginas;
        }

        public void setNumeroDePaginas(int numeroDePaginas) {
            this.numeroDePaginas = numeroDePaginas;
        }
        public void crearLibro(ArrayList<Libro> libros){
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Título?");
            String titulo = sc.nextLine();
            System.out.println("¿Autor?");
            String autor = sc.nextLine();
            System.out.println("¿Número de páginas?");
            int numeroDePaginas = sc.nextInt();
            Libro libro = new Libro(titulo, autor, numeroDePaginas);
            libros.add(libro);
            System.out.println("Libro " + libro.getTitulo() + " de " + libro.getAutor() + " (" + libro.getNumeroDePaginas() + " páginas) añadido");
        }
    }
    class Video extends Obra{
        int duracion;

        public Video(String titulo, String autor, int duracion) {
            super(titulo, autor);
            this.duracion = duracion;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }
        public void crearVideo(ArrayList<Video> videos){
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Título?");
            String titulo = sc.nextLine();
            System.out.println("¿Autor?");
            String autor = sc.nextLine();
            System.out.println("¿Duración? (minutos)");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, introduzca un número entero");
                sc.next();
            }
            int duracion = sc.nextInt();
            Video video = new Video(titulo, autor, duracion);
            videos.add(video);
            System.out.println("Vídeo " + video.getTitulo() + " de " + video.getAutor() + " (" + video.getDuracion() + " minutos) añadido");
        }
    }
    class Pedido {
        Cliente cliente;

        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Video> videos = new ArrayList<>();
ArrayList<Obra> obras = new ArrayList<>();




    }

    public void mostrarPedidos(ArrayList<Pedido> pedidos){
        for (Pedido pedido : pedidos) {
            System.out.println(" * Pedido de: " + pedido.cliente.getNombre() + ":");
            for (Obra obra : pedido.obras) {
                if (obra instanceof Libro) {
                    System.out.println(" - Libro " + obra.getTitulo() + " de " + obra.getAutor() + " (" + ((Libro) obra).getNumeroDePaginas() + " páginas)");
                } else if (obra instanceof Video) {
                    System.out.println(" - Vídeo " + obra.getTitulo() + " de " + obra.getAutor() + " (" + ((Video) obra).getDuracion() + " minutos)");
                }
            }
        }

                }
                public void crearPedido(ArrayList<Cliente> clientes, ArrayList<Libro> libros, ArrayList<Video> videos){
        ArrayList<Pedido> pedidos = new ArrayList<>();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("¿Qué cliente desea crear?");
                    Cliente.mostrarClientes(clientes);
                    int opcion3 = sc.nextInt();
                    Cliente cliente1 = clientes.get(opcion3);
                    System.out.println("¿Qué obra desea agregar al pedido?");
                    System.out.println("1 - Libro");
                    System.out.println("2 - Vídeo");
                    int opcion4 = sc.nextInt();
                    if (opcion4 == 1) {
                        System.out.println("¿Qué libro desea agregar al pedido?");
                        for (Libro libro : libros) {
                            System.out.println(" - Libro " + libro.getTitulo() + " de " + libro.getAutor() + " (" + libro.getNumeroDePaginas() + " páginas)");
                        }
                        Pedido pedido1 = new Pedido();
                        int opcion5 = sc.nextInt();
                        Libro libro1 = libros.get(opcion5);

                        pedido1.cliente = cliente1;
                        pedido1.obras.add(libro1);
                        pedidos.add(pedido1);

                    } else if (opcion4 == 2) {
                        System.out.println("¿Qué vídeo desea agregar al pedido?");
                        for (Video video : videos) {
                            System.out.println(" - Vídeo " + video.getTitulo() + " de " + video.getAutor() + " (" + video.getDuracion() + " minutos)");
                        }
                        int opcion6 = sc.nextInt();
                        Video video1 = videos.get(opcion6);
                        Pedido pedido1 = new Pedido();
                        pedido1.cliente = cliente1;
                        pedido1.obras.add(video1);
                        pedidos.add(pedido1);

                    }else {
                        System.out.println("Opción no válida");
                    }

                }
                public void Principal() {
                Scanner sc = new Scanner(System.in);
                ArrayList<Cliente> clientes = new ArrayList<>();
                ArrayList<Libro> libros = new ArrayList<>();
                ArrayList<Video> videos = new ArrayList<>();
                ArrayList<Pedido> pedidos = new ArrayList<>();
                int opcion = 0;
                while (opcion != 6) {
                    System.out.println(" -- Menú --");
                    System.out.println("1 - Mostrar clientes");
                    System.out.println("2 - Crear clientes");
                    System.out.println("3 - Crear una obra");
                    System.out.println("4 - Crear un pedido");
                    System.out.println("5 - Mostrar pedidos");
                    System.out.println("6 - Salir");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            Cliente.mostrarClientes(clientes);
                            break;
                        case 2:
                              Cliente cliente = new Cliente("", 0);
                                cliente.crearCliente(clientes);

                            break;
                        case 3:
                            System.out.println("¿Qué obra desea crear?");
                            System.out.println("1 - Libro");
                            System.out.println("2 - Vídeo");
                            int opcion2 = sc.nextInt();
                            switch (opcion2) {
                                case 1:
                                    Libro libro = new Libro("", "", 0);
                                    libro.crearLibro(libros);
                                    break;
                                case 2:
                                    Video video = new Video("", "", 0);
                                    video.crearVideo(videos);
                                    break;
                            }
                            break;
                        case 4:
                            crearPedido(clientes, libros, videos);
                            break;

                        case 5:
                            mostrarPedidos(pedidos);
                            break;
                        case 6:
                            System.out.println("Hasta luego");
                            break;


                    }
                }
            }
            public static void main(String[] args) {
                Ej2 ej2 = new Ej2();
                ej2.Principal();

            }
}

