 
            
            for(int i = 0 ; i < raw.length -1 ; i ++)
            {
                for(int j = 0;j<raw.length - i - 1 ; j ++)
                {
                    if(percentile[j]<percentile[j+1])
                    {
                        double t = percentile[j] ;         String s = name[j];     double r = raw[j];
                        percentile[j] = percentile[j+1];   name[j] = name[j+1];    raw[j] = raw[j+1];
                        percentile[j+1] = t ;                name[j+1] = s;        raw[j+1] = r;
                    }
                }
            }
            System.out.println("Name  " + " Raw score "+ " Percentile ");
            for(int i = 0 ; i < raw.length ; i ++ )
            {
                System.out.println(name[i] + "     " + raw[i] + "     " + percentile[i] );
            }