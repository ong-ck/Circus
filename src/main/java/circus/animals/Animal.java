package circus.animals;

import circus.Asset;

// make animal abstract to prevent creating the animal object -> animals does not exist by itself
// because you want a type heirarchy in your system but you don't want to create that object
public abstract class Animal implements Asset {

    public abstract String speak();

}
