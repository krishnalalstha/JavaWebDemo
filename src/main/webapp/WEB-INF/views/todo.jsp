
	<%@ include file="../common/header.jspf"%>
	<%@ include file="../common/navigation.jspf"%>
	<div class="container">
		<H1>Welcome ${name}</H1>

		<table class="table table-striped">
			<caption>Your Todos are</caption>
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td>&nbsp;&nbsp;<a class="btn btn-danger"
							href="/deletetodo.do?todo=${todo.name}&category=${todo.category}">Delete</a>
							&nbsp;&nbsp;<a class="btn btn-info"
							href="/edit-todo.do?todo=${todo.name}&category=${todo.category}">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a class="btn btn-primary" href="/add-todo.do">Add New Todo</a>
	</div>


<%@ include file="../common/footer.jspf"%>