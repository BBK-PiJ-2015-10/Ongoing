package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
public class Translator {

    private static final String PATH = "\\Users\\YasserAlejandro\\SDP\\Ongoing\\SDPOngoing\\src\\sml\\";
      
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        }
        return true;
    }

    // line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    @SuppressWarnings("unchecked")
    public Instruction getInstruction(String label) {
        int s1; // Possible operands of the instruction
        int s2;
        int r;
        int x;
        String relabel;
        
        Class c1 = null;
        Instruction instruction = null;

        if (line.equals(""))
            return null;

        String ins = scan();
        
        switch (ins) {
        	case "bnz":
        		r = scanInt();
        		relabel = scanString();
        		try {
        			c1 = Class.forName("sml.BnzInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
        		try {
        			instruction = (Instruction) c1.getConstructor(String.class,int.class,String.class).newInstance(label,r,relabel);
        		}
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction;	
        	
        	case "out":
        		r = scanInt();
        		try {
        			c1 = Class.forName("sml.OutInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
                	instruction = (Instruction) c1.getConstructor(String.class,int.class).newInstance(label,r);
                }
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction; 		
        		
        	case "div":
        		r = scanInt();
        		s1 = scanInt();
        		s2 = scanInt();
        		try {
        			c1 = Class.forName("sml.DivInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
                	instruction = (Instruction) c1.getConstructor(String.class,int.class,int.class,int.class).newInstance(label,r,s1,s2);
        		}
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction; 		
        	
        	case "mul":
        		r = scanInt();
        		s1 = scanInt();
        		s2 = scanInt();
        		try {
        			c1 = Class.forName("sml.MulInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
                	instruction = (Instruction) c1.getConstructor(String.class,int.class,int.class,int.class).newInstance(label,r,s1,s2);
        		}
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction;
        	
        	case "sub":
        		r = scanInt();
            	s1 = scanInt();
            	s2 = scanInt();	
            	try {
        			c1 = Class.forName("sml.SubInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
                	instruction = (Instruction) c1.getConstructor(String.class,int.class,int.class,int.class).newInstance(label,r,s1,s2);
        		}
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction;
            	
        	case "add":
                r = scanInt();
                s1 = scanInt();
                s2 = scanInt();
                try {
        			c1 = Class.forName("sml.AddInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
        			instruction = (Instruction) c1.getConstructor(String.class,int.class,int.class,int.class).newInstance(label,r,s1,s2);
        		}
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction;
            
        	case "lin":
                r = scanInt();
                s1 = scanInt();
                try {
        			c1 = Class.forName("sml.LinInstruction");
        		}
        		catch (ClassNotFoundException ex){
        			ex.printStackTrace();
        		}
                try {
        			instruction = (Instruction) c1.getConstructor(String.class,int.class,int.class).newInstance(label,r,s1);
        		}
        		
        		catch (NoSuchMethodException | SecurityException e) {
        				e.printStackTrace();
        		} 
        		catch (InstantiationException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalAccessException e) {
        				e.printStackTrace();
        		} 
        		catch (IllegalArgumentException e) {
        				e.printStackTrace();
        		} 
        		catch (InvocationTargetException e) {
        				e.printStackTrace();
        		}
                return instruction;
                
        }

        return null;
    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
    
    
    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private String scanString() {
        String word = scan();
        return word;
    }    
        
        
    
    
    
}