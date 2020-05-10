<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.min.css">

</head>
<body>

<div class="container">
		<form class="form-horizontal" action="show">
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<div class="alert alert-success" role="alert"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<h2>Register New User</h2>
					<hr>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="name">Employee ID</label>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">
								<i class="fa fa-user"></i>
							</div>
							<input type="text" class="form-control" id="id" name="id"
								placeholder="ID"  autofocus>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="name">First Name</label>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">
								<i class="fa fa-user"></i>
							</div>
							<input type="text" class="form-control" id="firstname" name="fname"
								placeholder="First Name" required autofocus>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="name">Last Name</label>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">
								<i class="fa fa-user"></i>
							</div>
							<input type="text" class="form-control" id="lastname" name="lname"
								placeholder="Last name" required autofocus>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="email">Email</label>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">

								<i class="fa fa-envelope"></i>
							</div>
							<input type="text" class="form-control" id="email" name="email"
								placeholder="username@gmail.com" required autofocus>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="form-control-feedback">
						<span class="text-danger align-middle"> </span>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="email">Country</label>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">
								<i class="fa fa-globe"></i>
							</div>
							<select id="country" name="country">
								<option value="India">India</option>
								<option value="USA">USA</option>
								<option value="UAE">UAE</option>
								<option value="Japan">Japan</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="form-control-feedback">
						<span class="text-danger align-middle"> </span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 field-label-responsive">
					<label for="Age">Age</label>
				</div>
				<div class="col-md-6">
					<div class="form-group has-danger">
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<div class="input-group-addon" style="width: 2.6rem">
<!-- 								<i class="fa fa-key"></i> -->
							</div>
							<input type="text" class="form-control" id="age" name="age"
								placeholder="Age" required>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="form-control-feedback">
						<span class="text-danger align-middle"> </span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<button type="submit" class="btn btn-success">
						<i class="fa fa-user-plus"></i> Register
					</button>
				</div>
			</div>
		</form>
	</div>
	


</body>
</html>