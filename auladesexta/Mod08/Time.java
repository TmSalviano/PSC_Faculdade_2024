package auladesexta.Mod08;
class Time {
    private int segundo;
    private int minuto;
    private int hora;

    
    public Time() { 
        try {
            setHora(0);
            setMinuto(0);
            setSegundo(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Time(int hora) { 
        try {
            setHora(hora);
            setMinuto(0);
            setSegundo(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Time(int hora, int minuto) { 
        try {
            setHora(hora);
            setMinuto(minuto);
            setSegundo(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Time(int hora, int minuto, int segundo) { 
        try {
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public int getSegundo() {
        return segundo;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getHora() {
        return hora;
    }
    
    public void setTime(int hora, int minuto, int segundo) throws Exception {
        if(hora < 24 && hora >=0 )
            this.hora = hora;
        else 
            throw new Exception("hora has to be less than 24 and greater or equal to 0");

        if(minuto < 60 && minuto >= 0)
            this.minuto = minuto;
        else 
            throw new Exception("minuto has to be less than 60 and greater or equal to 0");

        if(segundo < 60 && segundo >= 0)
            this.segundo = segundo;
        else 
            throw new Exception("segundo has to be less than 60 and greater or equal to 0");
    }
    
    public void setSegundo(int segundo) throws Exception {
        if(segundo < 60 && segundo >= 0)
        this.segundo = segundo;
        else {
                throw new Exception("segundo has to be less than 60 and greater or equal to 0");
            }
    }
    public void setMinuto(int minuto) throws Exception {
        if(minuto < 60 && minuto >= 0)
        this.minuto = minuto;
        else {
            throw new Exception("minuto has to be less than 60 and greater or equal to 0");
        }
    }
    public void setHora(int hora) throws Exception {
        if(hora < 24 && hora >=0 )
        this.hora = hora;
        else {
            throw new Exception("hora has to be less than 24 and greater or equal to 0");
        }
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

}