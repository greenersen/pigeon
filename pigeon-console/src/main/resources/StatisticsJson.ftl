{"serverRequestsSent": [
<#list requestsInLastSecondOfInvoker?keys as key>
	{
		"address": "${key}",
		"requestsInLastSecond": "${requestsInLastSecondOfInvoker[key]}"
	}<#if key_has_next>,</#if>
</#list>
],"appRequestsSent": [
<#list appRequestsOfInvoker?keys as key>
	{
		"app": "${key}",
		"requests": "${appRequestsOfInvoker[key]}"
	}<#if key_has_next>,</#if>
</#list>
],"appRequestsReceived": [
<#list appRequestsOfProvider?keys as key>
	{
		"app": "${key}",
		"requests": "${appRequestsOfProvider[key]}"
	}<#if key_has_next>,</#if>
</#list>
],"serverProcessorStatistics": [
<#list serverProcessorStatistics?keys as key>
	{
		"server": "${key}",
		"processorStatistics": "${serverProcessorStatistics[key]}"
	}<#if key_has_next>,</#if>
</#list>
],"serverWeightStatistics": [
<#list weightFactors?keys as key>
	{
		"server": "${key}",
		"weightFactors": "${weightFactors[key]}"
	}<#if key_has_next>,</#if>
</#list>
],"invokerConfigStatistics": [
<#list invokerConfigs as x>
	{
		"service": "${x.url}",
		"timeout": "${x.timeout}",
		"callType": "${x.callType}",
		"InvokerMethodConfigs" : [
		<#if x.methods?exists>
		<#list x.methods?keys as mKey>
			{
				"method": "${mKey}",
				"timeout": "${(x.methods)[mKey].timeout}"
			}<#if mKey_has_next>,</#if>
		</#list>
		</#if>
		]
	}<#if x_has_next>,</#if>
</#list>
],"otherStatistics": [
<#list others?keys as key>
	{
		"source": "${key}",
		"info": "${others[key]}"
	}<#if key_has_next>,</#if>
</#list>
]
}

