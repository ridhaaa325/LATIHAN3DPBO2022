class Processor
{
    private:
        string name;
        int price;

        /* data */
    public:
        // constructor with parameter
        Processor(string name, int price)
        {
            this->name = name;
            this->price = price;
        }
        Processor(){
        }

        // methods setter
        void setName(string name)
        {
            this->name = name;
        }
        string getName()
        {
            return this->name;
        }
       
        void setPrice(int price)
        {
            this->price = price;
        }   
        int getPrice()
        {
            return this->price;
        }


        ~Processor(){
            
        }
};
