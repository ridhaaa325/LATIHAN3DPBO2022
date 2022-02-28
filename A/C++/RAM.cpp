class RAM
{
    private:
        string capacity;
        int price;

        /* data */
    public:
        // constructor with parameter
        RAM(string capacity, int price)
        {
            this->capacity = capacity;
            this->price = price;
        }
        // costructor
        RAM(){
        }

        // methods setter
        void setCapacity(string capacity)
        {
            this->capacity = capacity;
        }
        string getCapacity()
        {
            return this->capacity;
        }
       
        void setPrice(int price)
        {
            this->price = price;
        }
        int getPrice()
        {
            return this->price;
        }


        ~RAM(){
            
        }
};
