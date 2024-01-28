#MODULE="Modules/LoLDictionaryNetwork/Sources/LoLDictionaryNetwork"
MODULE="Modules/"
openapi-generator generate -g kotlin -i "ddriotapi.yml" --library multiplatform -o "ddriotapi2"
#rm -r $MODULE""*
#cp -R "ddriotapi2/OpenAPIClient/Classes/OpenAPIs/". $MODULE
#rm -r "ddriotapi2"
