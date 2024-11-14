package LAB7;

public class Carte extends Publicatie {
    int nr_pagini;

    Carte(){}

    Carte(int nr_pagini,String Titlu,String Autor,int An)
    {
        super(Titlu,Autor,An);
        this.nr_pagini = nr_pagini;
    }

    int get_nr_pagini()
    {
        return nr_pagini;
    }
    void setNr_pagini(int nr_pagini)
    {
        this.nr_pagini = nr_pagini;
    }
    public String toString()
    {
        return super.toString() + "\nnr_pagini: " + nr_pagini;
    }

}
