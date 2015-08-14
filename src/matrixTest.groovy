/**
 * Created by iansari on 8/13/15.
 */


resultMap = new HashMap();




def initMap(paramlist) {



    def os = ["mac" , "windows"]
    def arch = ["64", "32"]
    def relType = ["release", "debug"]

    HashMap map = ["os" : os, "arch" : arch, "relType" : relType ]

    paramlist.each(){ p ->

        //println p

        map.each() { k, v ->

            if (v.contains(p)) {
                //println p

                if (resultMap.containsKey(k)){
                    //println k
                    def tmpVal = resultMap.get(k)
                    resultMap.put(k,  tmpVal  << p)
                    //resultMap.put(k,  ["a", "b", "c"] )
                } else {
                    resultMap.put(k, [p])
                }

            }
        }

    }



    //return resultMap
}

initMap(["mac", "windows", "64", "32", "debug", "release"]);

println resultMap


resultMap.get("os").each(){
    os = it
    resultMap.get("arch").each(){
        arch = it
        resultMap.get("relType").each(){
            relType = it
            println "${os}_${arch}_${relType}"
        }
    }

}

/*resultMap.each(){ k,v ->
    //println k
    v.each(){v2 ->
      println "${k}_${v2}"
    }
}*/


