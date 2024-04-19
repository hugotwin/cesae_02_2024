package Exercicio1;

import Exercicio1.Enum.TipoDieta;
import Exercicio1.Enum.TipoFamilia;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {

    private String nome;
    private double agua_litros;

    private ArrayList<SerVivo> listaSerVivos;


    public MeioAmbiente(String nome, double agua_litros) {
        this.nome = nome;
        this.agua_litros = agua_litros;
        this.listaSerVivos = new ArrayList<SerVivo>();
    }

    /**
     * Funcao que retorna todos o index da familia plantas
     *
     * @return
     */
    public ArrayList<Integer> indexPlantas() {
        ArrayList<Integer> lista = new <Integer>ArrayList();
        int count = 0;
        for (SerVivo itemSer : listaSerVivos) {
            if (itemSer instanceof Planta) {

                lista.add(count);
            }
        }
        return lista;
    }


    /**
     * Funcao que devolve uma lista de index de Insectos na lista de ser vivos
     *
     * @return
     */
    public ArrayList<Integer> indexInsectos() {
        ArrayList<Integer> lista = new <Integer>ArrayList();
        int count = 0;
        for (SerVivo itemSer : listaSerVivos) {
            if (itemSer instanceof Insecto) {

                lista.add(count);
            }
        }
        return lista;
    }

    public ArrayList<Integer> indexAnimal() {
        ArrayList<Integer> lista = new <Integer>ArrayList();
        int count = 0;
        for (SerVivo itemSer : listaSerVivos) {
            if (itemSer instanceof Animal) {

                lista.add(count);
            }
        }
        return lista;
    }

    public boolean plantaBebe(int indexPlanta) {

        if (listaSerVivos.get(indexPlanta) instanceof Planta) {

        Planta planta = (Planta) listaSerVivos.get(indexPlanta);


        if (planta.getFamilia().equals(TipoFamilia.ÁRVORES) && agua_litros >= 1) {
            this.agua_litros -= 1;
            return true;
        } else if (planta.getFamilia().equals(TipoFamilia.FLORES) && agua_litros >= 0.1) {
            this.agua_litros -= 0.1;
            return true;
        } else if (planta.getFamilia().equals(TipoFamilia.ERVAS) && agua_litros >= 0.25) {
            this.agua_litros -= 0.25;
            return true;
        } else {

            this.ultimoVivo();
            listaSerVivos.remove(indexPlanta);
            return false;
        }}
        return false;
    }

    public boolean plantaComeInsectos(int indexPlanta) {
        if (listaSerVivos.get(indexPlanta) instanceof Planta) {

            Planta planta = (Planta) listaSerVivos.get(indexPlanta);

            if (planta.getFamilia().equals(TipoFamilia.COME_INSECTOS)) {
                if (!indexInsectos().isEmpty()) {// verifia  se ha insectos
                    return true;
                } else {
                    this.ultimoVivo();// se estiver vazio morre a panta
                    listaSerVivos.remove(indexPlanta);
                    return false;
                }
            }
        }
        return false;
    }


    public String plantaAbanaComVento(int indexPlanta) {
        if (listaSerVivos.get(indexPlanta) instanceof Planta) {

            return "Está muito vento";
        }
        return "Não é uma planta";
    }

    public void animalFazBarulho(int indexAnimal) {
        if (listaSerVivos.get(indexAnimal) instanceof Animal) {
            Animal animal = (Animal) listaSerVivos.get(indexAnimal);
            System.out.println(animal.getBarulho());
        } else {
            System.out.println("Não é animal");
        }
    }

    public void animalMovimenta(int indexAnimal) {
        if (listaSerVivos.get(indexAnimal) instanceof Animal) {
            Animal animal = (Animal) listaSerVivos.get(indexAnimal);
            ;
            System.out.println("O "+animal.getNome()+" movimentou-se");

        } else {
            System.out.println("Não é animal");
        }
    }

    /**
     * Funcao que faz com que o animal bebe agua
     * @param indexAnimal
     * @return true ou false
     */
    public boolean animalBebe(int indexAnimal) {

        if (listaSerVivos.get(indexAnimal) instanceof Animal) {

            Animal animal = (Animal) listaSerVivos.get(indexAnimal);

            if(this.agua_litros>=animal.getPeso_Kg()*0.25)
                {
                    this.agua_litros-=animal.getPeso_Kg()*0.25;
                    return true;

                }
            this.ultimoVivo();
            listaSerVivos.remove(indexAnimal);
                return false;
            }

        return false;
    }

    /**
     * funcao que faz animal comer
     * @param indexAnimal
     * @return um boolen true ou false o animal comeu ou nao
     */
    public boolean animalCome(int indexAnimal) {

        if (listaSerVivos.get(indexAnimal) instanceof Animal) {

            Animal animal = (Animal) listaSerVivos.get(indexAnimal);

            if(animal.isFome())
            {

                if(animal.getDieta().equals(TipoDieta.HERVIBORO) || animal.getDieta().equals(TipoDieta.OMINIVORO))
                {
                    int count =0;
                    for(SerVivo item :listaSerVivos)
                    {
                        count++;
                        if (item instanceof Planta)
                        {

                            if(animal.isFome() && animal.getInteligência()<20 && ((Planta) item).getGrau_defesa()<=1)
                            { animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}
                            else if (animal.isFome() && animal.getInteligência()<40 && ((Planta) item).getGrau_defesa()<=2)
                            {animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}
                            else if (animal.isFome() && animal.getInteligência()<60 && ((Planta) item).getGrau_defesa()<=3)
                            {animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}
                            else if (animal.isFome() && animal.getInteligência()<80 && ((Planta) item).getGrau_defesa()<=4)
                            {animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}
                            else if (animal.isFome() && animal.getInteligência()>=80 && ((Planta) item).getGrau_defesa()<=5)
                            {animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}

                        }
                    }

                }
                if(animal.getDieta().equals(TipoDieta.CARNIVORO) || animal.getDieta().equals(TipoDieta.OMINIVORO))
                {

                    int count =0;
                    for(SerVivo item :listaSerVivos)
                    {
                        count++;
                        if (item instanceof Animal)
                        {
                            Animal itemAnimal =(Animal) item;
                            
                            if((animal.getPeso_Kg()+animal.getInteligência()*2.5)>(itemAnimal.getPeso_Kg()+itemAnimal.getInteligência()*2.5))
                            {animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}
                            else{animal.setFome(false); return false; }



                        } else if (item instanceof Insecto)
                        {

                            if(((Insecto)item).isVenenoso()){this.ultimoVivo(); listaSerVivos.remove(indexAnimal); this.ultimoVivo(); listaSerVivos.remove(count);return false; }
                            else{animal.setFome(false); this.ultimoVivo(); listaSerVivos.remove(count); return true;}

                        }
                    }

                }
            }else{
            System.out.println("O animal está de barriga cheia");
            return true;}
        }

        return false;
    }

    public void exibirListaSerVivos()
    {
        for(SerVivo item:listaSerVivos)
        {
            System.out.println(item.getClass().getName());
            item.exibirDados();
        }
    }

    public void adicionarSerVivo(SerVivo servivo) {
        for (SerVivo item : listaSerVivos) {
            if (item.hashCode() == servivo.hashCode()) {
                System.out.println("O ser vivo ja existe na lista");
                return;
            }
        }

        listaSerVivos.add(servivo);
        this.exibirListaSerVivos();
    }

    public void simulador(int dias)
    {

        ArrayList<SerVivo> ultimoMorto= new <SerVivo>ArrayList(1);



        for (int r = 0; r < dias; r++)
        {
            System.out.println("Incia um novo dia");

            this.exibirListaSerVivos();

            for(Integer index : indexAnimal()){
                Animal animal = (Animal) listaSerVivos.get(index);
                animal.setFome(true);
            }

            for(int t=0; t<3; t++) { // 3 momentos do dia

                Random rand = new Random();
                int acontecimento = rand.nextInt(1, 5);

                //planta
                if (acontecimento == 1) {

                    ArrayList<Integer> lista = indexPlantas();//index das plantas na lista de seres vivos
                    int index = rand.nextInt(lista.size());
                    Planta planta = (Planta) listaSerVivos.get(lista.get(index));// vais buscar o ser vivo da lista de sers com o index indicado

                    if (planta.getFamilia().equals(TipoFamilia.COME_INSECTOS)) {
                        acontecimento = rand.nextInt(3);
                        if (acontecimento == 2) {
                            plantaComeInsectos(lista.get(index));
                        } else if (acontecimento == 1) {
                            plantaBebe(lista.get(index));
                        } else if (acontecimento == 0) {
                            plantaAbanaComVento(lista.get(index));
                        }


                    } else {
                        acontecimento = rand.nextInt(2);
                        if (acontecimento == 1) {
                            plantaBebe(lista.get(index));
                        } else if (acontecimento == 0) {
                            plantaAbanaComVento(lista.get(index));
                        }
                    }
                }
                //animal
                if (acontecimento == 2) {

                    ArrayList<Integer> lista = indexAnimal();//index das plantas na lista de seres vivos
                    int index = rand.nextInt(lista.size());
                    acontecimento = rand.nextInt(4);

                    if (acontecimento == 0) {
                        this.animalBebe(index);
                    } else if (acontecimento == 1) {
                        this.animalCome(index);
                    } else if (acontecimento == 2) {
                        this.animalMovimenta(index);
                    } else if (acontecimento == 3) {
                        this.animalFazBarulho(index);
                    }


                }
                //insecto
                if (acontecimento == 3) {

                    ArrayList<Integer> lista = indexInsectos();//index das plantas na lista de seres vivos
                    int index = rand.nextInt(lista.size());
                    acontecimento = rand.nextInt(4);
                    Insecto insecto = (Insecto) listaSerVivos.get(index);
                    insecto.insectoChateia();

                }
                // catratrofe
                if (acontecimento == 4) {

                    acontecimento = rand.nextInt(1, 4);

                    if (acontecimento == 1) {
                        this.agua_litros = this.agua_litros / 2;
                    } else if (acontecimento == 2) {
                        this.agua_litros = this.agua_litros * 2;
                    } else if (acontecimento == 3) {//erupcao

                        ArrayList<Integer> indexAnimais = indexAnimal();


                        for (int n = indexAnimais.size() / 2; n >0 ; n--) {

                            listaSerVivos.remove(indexAnimais.get(n));
                            this.ultimoVivo();

                        }

                        ArrayList<Integer> indexPlantas = indexPlantas();
                        for (int n =indexPlantas.size() / 2 ; n >0 ; n--) {
                            listaSerVivos.remove(indexPlantas.get(n));
                            this.ultimoVivo();

                        }

                        System.out.println(this.listaSerVivos);

                    }

                }

            }
            //final do dia passar por todos os seres vivos verificar se algum animal com fome invocar o metodo come
            // se não comer morre
                    for(Integer index : indexAnimal())
                    {
                       if (!((Animal) listaSerVivos.get(index)).isFome())
                       {

                           boolean comer =this.animalCome(index);
                           if(!comer)
                           {
                               this.ultimoVivo();
                               listaSerVivos.remove(index);

                           }

                       }



                    }

        }

        if(!listaSerVivos.isEmpty()){exibirListaSerVivos();}
        else {

            ultimoVivo().exibirDados();

        }


    }

    public SerVivo ultimoVivo() {
       ArrayList<SerVivo> ultimo = new ArrayList<SerVivo>(1);
        if (listaSerVivos.size() == 1) {
            ultimo.set(0, listaSerVivos.get(0) );
        }
        return ultimo.get(0);
    }




}
