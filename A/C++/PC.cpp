class PC
{
    private:
        Processor pOBJ;
        Disk dOBJ;
        RAM rOBJ;
        int countPrice = 0;

        /* data */
    public:
        // constructor with parameter
        

        PC(Processor pro, Disk dis, RAM ram, int price)
        {
            this->pOBJ = pro;
            this->dOBJ = dis;
            this->rOBJ = ram;
            this->countPrice = price;
        }
        PC(){
        }

        // methods setter
        void setProcessor(Processor pro)
        {
            this->pOBJ = pro;
        }
        Processor getProcessor()
        {
            return this->pOBJ;
        }

        void setDisk(Disk dis)
        {
            this->dOBJ = dis;
        }
        Disk getDisk()
        {
            return this->dOBJ;
        }
       
        void setRAM(RAM ram)
        {
            this->rOBJ = ram;
        }
        RAM getRAM()
        {
            return this->rOBJ;
        }

        void setCountPrice(int prc1, int prc2, int prc3)
        {
            this->countPrice = prc1+prc2+prc3;
        }        
        int getCountPrice()
        {
            return this->countPrice;
        }
        

        ~PC(){
            
        }
};
