/**
 * Created by iansari on 8/14/15.
 */
currentBuild.getRawBuild().getAllActions().each() { k, v ->

    if (k instanceof ParametersAction) {
        k.getParameters().each() { k2, v2 ->
            println k2.getName()
            println k2.getValue()
        }
    }

}