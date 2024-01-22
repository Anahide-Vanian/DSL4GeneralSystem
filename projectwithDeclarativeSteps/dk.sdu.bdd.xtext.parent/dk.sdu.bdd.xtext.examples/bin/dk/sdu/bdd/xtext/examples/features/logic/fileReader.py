

def readFile():

    scenarioCounter = 0
    with open('../sample.bdd') as f:
        fileWriter = open("../features/tests.feature","w")
        content = f.readlines()
        disallowedStrings = ['actions','states', 'properties','}' ,'/*','*/', "which means", '//', 'declarative', 'imperative', 'model'  ]
        for i in range(0,len(content)):
            line = content[i]
            if any(x in line for x in disallowedStrings):
                pass
            elif(line.startswith('Scenario:')):#check which scenario
                scenarioCounter += 1
                #if first scenario, feature takes same name
                if(scenarioCounter == 1):
                    #write title of Feature
                    scenario = line.replace('"',"").replace("Scenario: ","")
                    s = "Feature: " + scenario
                    fileWriter.write(s)
                    #write title of first scenario
                    s = '\n'+'\tScenario: '+ scenario
                    fileWriter.write(s)
                elif(scenarioCounter >= 1):#if following scenarios
                    scenario = line.replace('"',"").replace("Scenario: ","")
                    s = '\n'+'\tScenario: '+ scenario
                    fileWriter.write(s)
            else:     
                fileWriter.write('\t' + '\t' + line)
        fileWriter.close()