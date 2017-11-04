<#ftl encoding="utf-8">

<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
    </tr>
    <#list model.students as student>
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.surname}</td>
        </tr>
    </#list>
</table>
</body>