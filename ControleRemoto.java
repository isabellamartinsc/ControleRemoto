
public class ControleRemoto implements Controlador{

    // ATRIBUTOS//
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menu;

    // METODOS ESPECIAIS//
    ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }

    // SET
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private void setMenu(boolean menu) {
        this.menu = menu;
    }

    // GET
    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private boolean getMenu() {
        return menu;
    }


      
    public void ligar(){
        if(getLigado() == false) {
            setLigado(true);
            System.out.println("Ligado!");
        } else {
            System.out.println("Aviso: já está ligado!");
        }
    }

    public void desligar(){
        if(getLigado() == true) {
            setLigado(false);
            System.out.println("Desligado!");
        } else {
            System.out.println("Aviso: ja está desligado!");
        }
    }
  
    public void abrirMenu(){
        if(!getMenu()){
            setMenu(true);
            System.out.println("O menu está aberto!");
        } else {
            System.out.println("O menu ja está aberto!");
        }
    }

    public void fecharMenu(){
        if(getMenu()){
            setMenu(false);
            System.out.println("O menu está fechado!");
        } else {
            System.out.println("O menu ja está fechado!");
        }
    }

    public void maisVolume() {
       setVolume(getVolume() + 10);
       System.out.println("Volume aumentado, total volume: " + getVolume());
    }

    public void menosVolume() {
        setVolume(getVolume() - 10);
        System.out.println("Volume abaixado, total volume: " + getVolume());
        
    }
    public void ligarMudo() {
        setVolume(0);
        System.out.println("Volume mudo, total volume: " + getVolume());
    }

    public void desligarMudo() {
        setVolume(50);
        System.out.println("Mudo desligado, total volume: " + getVolume());
    }
    
    public void play() {
        if(getTocando() == false) {
            setTocando(true);
            System.out.println("Volume tocando!");
        } else {
            System.out.println("O volume já está tocando: ");
        }
    }

    public void pause() {
        if(getTocando() == true) {
            setTocando(false);
            System.out.println("Volume pausado!");
        } else {
            System.out.println("O volume ja está pausado!");
        }
    }       
    
}