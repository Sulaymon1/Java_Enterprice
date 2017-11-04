<#ftl encoding='UTF-8'>

<body>
<table>
    <tr>
        <th>Id</th>
        <#--<th>Name</th>-->
        <th>Surname</th>
        <th>Position</th>
    </tr>
    <#list model.doctors as doctor>
        <tr>
            <td>${doctor.id}</td>
           <#--<td>${doctor.name}</td>-->
            <td>${doctor.surname}</td>
            <td>${doctor.position}</td>
        </tr>
    </#list>
</table>
</body>