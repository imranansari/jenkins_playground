/**
 * Created by iansari on 9/14/15.
 */


//System.properties << [ 'http.proxyHost':'proxyHost', 'http.proxyPort':'port' ]

def url = 'http://nectar-downloads.cloudbees.com/cjoc/1.609/war/1.609.1.1/jenkins-oc.war'
def file = new File('jenkins-oc.war').newOutputStream()
file << new URL(url).openStream()
file.close()
