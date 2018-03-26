package xmlexample;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.util.*;
import java.io.*;

public class XMLExample 
{
    private static final String fileName = "test.xml";
    
    public static void main(String[] args) 
    {
        try
        {
            Vector<Human> humansOriginal = new Vector<>();
        
            for (int i = 0; i < 10; ++i)
                humansOriginal.add(HumanGenerator.Generate());
            
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
            encoder.writeObject(humansOriginal);
            encoder.close();
            
            Vector<Human> humansDeserialized;
            
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
            humansDeserialized = (Vector<Human>)d.readObject();
            d.close();
            
            if (humansOriginal.size() != humansDeserialized.size())
                throw new IOException("Nesutampa dydziai");
            
            for (int i = 0; i < humansOriginal.size(); ++i)
            {
                if (humansOriginal.get(i).getFirstName().compareTo(humansDeserialized.get(i).getFirstName()) != 0)
                    throw new IOException("Nesutampa vardai");
                
                if (humansOriginal.get(i).getLastName().compareTo(humansDeserialized.get(i).getLastName()) != 0)
                    throw new IOException("Nesutampa pavardes");
                
                if (humansOriginal.get(i).getBirthDate().compareTo(humansDeserialized.get(i).getBirthDate()) != 0)
                    throw new IOException("Nesutampa gimimo data");
                
                if (humansOriginal.get(i).getMoney() != humansDeserialized.get(i).getMoney())
                    throw new IOException("Nesutampa pinigai");
                
                if (humansOriginal.get(i).getGender() != humansDeserialized.get(i).getGender())
                    throw new IOException("Nesutampa lytis");
            }
            
            System.out.println("Viskas gerai!");*/
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println("Serializacijos klaida: " + e.getMessage());
        }
    }
}
