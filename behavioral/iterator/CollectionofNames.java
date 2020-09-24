package behavioral.iterator;

public class CollectionofNames implements Container {

    public String name[] = {"Master", "Inzy","Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};

    public int age[] = {26, 25, 24, 25, 23};

    public String address[] = {"Master", "DEV","New Delhi", "Gaziabad", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};

    public String designation[] = {"Master", "Java Programmer and Content Writer", "CEO", "Programmer and Web Designer", "Manager", ".Net Trainer"};


    @Override
    public Iterator getIterator() {

        return new CollectionofNamesIterate();
    }


    private class CollectionofNamesIterate implements Iterator {

        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }

    }
}


