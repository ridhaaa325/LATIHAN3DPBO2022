class Disk
{
    private:
        string type;
        string capacity;
        int price;

        /* data */
    public:
        // constructor with parameter
        Disk(string type, string capacity, int price)
        {
            this->type = type;
            this->capacity = capacity;
            this->price = price;
        }
        // costructor
        Disk(){
        }

        // methods setter
        void setType(string type)
        {
            this->type = type;
        }
        string getType()
        {
            return this->type;
        }

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


        ~Disk(){
            
        }
};
