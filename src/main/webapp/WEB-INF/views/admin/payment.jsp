<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html
        lang="en"
        class="light-style layout-menu-fixed"
        dir="ltr"
        data-theme="theme-default"
        data-assets-path="../assets/"
        data-template="vertical-menu-template-free"
>
<head>
    <meta charset="utf-8"/>
    <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"
    />

    <title>Product Manager</title>

    <meta name="description" content=""/>

    <!-- Favicon -->
    <link rel="icon" type="image/x-icon" href="../assets/img/favicon/favicon.ico"/>

    <!-- Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com"/>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
    <link
            href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
            rel="stylesheet"
    />

    <!-- Icons-->
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <!-- Core CSS -->
    <link rel="stylesheet" href="../assets/vendor/css/core.css" class="template-customizer-core-css"/>
    <link rel="stylesheet" href="../assets/vendor/css/theme-default.css" class="template-customizer-theme-css"/>
    <link rel="stylesheet" href="../assets/css/demo.css"/>

    <!-- Vendors CSS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"
            integrity="sha512-ec1IDrAZxPSKIe2wZpNhxoFIDjmqJ+Z5SGhbuXZrw+VheJu2MqqJfnYsCD8rf71sQfKYMF4JxNSnKCjDCZ/Hlw=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <!-- Page CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!--! Config-->
    <script src="../assets/js/config.js"></script>
    <!-- Helpers -->
    <script src="../assets/vendor/js/helpers.js"></script>
    <style>
        #product_edit {
            visibility: hidden;

        }

        #product_edit.active {
            visibility: visible;

        }

        #create-product {
            visibility: hidden;

        }

        #create-product.active {
            visibility: visible;

        }

        #blur-action.active {
            filter: blur(4px);
            pointer-events: none;
            user-select: none;
        }
    </style>
</head>

<body>
<!-- Layout wrapper -->
<div class="layout-wrapper layout-content-navbar">
    <div class="layout-container">
        <!-- Menu -->

        <aside id="layout-menu" class="layout-menu menu-vertical menu bg-menu-theme">
            <div class="app-brand demo">
                <a href="index.html" class="app-brand-link">
              <span class="app-brand-logo demo">
                <svg
                        width="25"
                        viewBox="0 0 25 42"
                        version="1.1"
                        xmlns="http://www.w3.org/2000/svg"
                        xmlns:xlink="http://www.w3.org/1999/xlink"
                >
                  <defs>
                    <path
                            d="M13.7918663,0.358365126 L3.39788168,7.44174259 C0.566865006,9.69408886 -0.379795268,12.4788597 0.557900856,15.7960551 C0.68998853,16.2305145 1.09562888,17.7872135 3.12357076,19.2293357 C3.8146334,19.7207684 5.32369333,20.3834223 7.65075054,21.2172976 L7.59773219,21.2525164 L2.63468769,24.5493413 C0.445452254,26.3002124 0.0884951797,28.5083815 1.56381646,31.1738486 C2.83770406,32.8170431 5.20850219,33.2640127 7.09180128,32.5391577 C8.347334,32.0559211 11.4559176,30.0011079 16.4175519,26.3747182 C18.0338572,24.4997857 18.6973423,22.4544883 18.4080071,20.2388261 C17.963753,17.5346866 16.1776345,15.5799961 13.0496516,14.3747546 L10.9194936,13.4715819 L18.6192054,7.984237 L13.7918663,0.358365126 Z"
                            id="path-1"
                    ></path>
                    <path
                            d="M5.47320593,6.00457225 C4.05321814,8.216144 4.36334763,10.0722806 6.40359441,11.5729822 C8.61520715,12.571656 10.0999176,13.2171421 10.8577257,13.5094407 L15.5088241,14.433041 L18.6192054,7.984237 C15.5364148,3.11535317 13.9273018,0.573395879 13.7918663,0.358365126 C13.5790555,0.511491653 10.8061687,2.3935607 5.47320593,6.00457225 Z"
                            id="path-3"
                    ></path>
                    <path
                            d="M7.50063644,21.2294429 L12.3234468,23.3159332 C14.1688022,24.7579751 14.397098,26.4880487 13.008334,28.506154 C11.6195701,30.5242593 10.3099883,31.790241 9.07958868,32.3040991 C5.78142938,33.4346997 4.13234973,34 4.13234973,34 C4.13234973,34 2.75489982,33.0538207 2.37032616e-14,31.1614621 C-0.55822714,27.8186216 -0.55822714,26.0572515 -4.05231404e-15,25.8773518 C0.83734071,25.6075023 2.77988457,22.8248993 3.3049379,22.52991 C3.65497346,22.3332504 5.05353963,21.8997614 7.50063644,21.2294429 Z"
                            id="path-4"
                    ></path>
                    <path
                            d="M20.6,7.13333333 L25.6,13.8 C26.2627417,14.6836556 26.0836556,15.9372583 25.2,16.6 C24.8538077,16.8596443 24.4327404,17 24,17 L14,17 C12.8954305,17 12,16.1045695 12,15 C12,14.5672596 12.1403557,14.1461923 12.4,13.8 L17.4,7.13333333 C18.0627417,6.24967773 19.3163444,6.07059163 20.2,6.73333333 C20.3516113,6.84704183 20.4862915,6.981722 20.6,7.13333333 Z"
                            id="path-5"
                    ></path>
                  </defs>
                  <g id="g-app-brand" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                    <g id="Brand-Logo" transform="translate(-27.000000, -15.000000)">
                      <g id="Icon" transform="translate(27.000000, 15.000000)">
                        <g id="Mask" transform="translate(0.000000, 8.000000)">
                          <mask id="mask-2" fill="white">
                            <use xlink:href="#path-1"></use>
                          </mask>
                          <use fill="#696cff" xlink:href="#path-1"></use>
                          <g id="Path-3" mask="url(#mask-2)">
                            <use fill="#696cff" xlink:href="#path-3"></use>
                            <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-3"></use>
                          </g>
                          <g id="Path-4" mask="url(#mask-2)">
                            <use fill="#696cff" xlink:href="#path-4"></use>
                            <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-4"></use>
                          </g>
                        </g>
                        <g
                                id="Triangle"
                                transform="translate(19.000000, 11.000000) rotate(-300.000000) translate(-19.000000, -11.000000) "
                        >
                          <use fill="#696cff" xlink:href="#path-5"></use>
                          <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-5"></use>
                        </g>
                      </g>
                    </g>
                  </g>
                </svg>
              </span>
                    <span class="app-brand-text demo menu-text fw-bolder ms-2">Admin</span>
                </a>

                <a href="javascript:void(0);" class="layout-menu-toggle menu-link text-large ms-auto d-block d-xl-none">
                    <i class="bx bx-chevron-left bx-sm align-middle"></i>
                </a>
            </div>

            <div class="menu-inner-shadow"></div>

            <ul class="menu-inner py-1">
                <!-- Dashboard -->
                <li class="menu-item">
                    <a href="index.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-home-circle"></i>
                        <div data-i18n="Analytics">Dashboard</div>
                    </a>
                </li>

                <!-- Layouts -->
                <li class="menu-item">
                    <a href="javascript:void(0);" class="menu-link menu-toggle">
                        <i class="menu-icon tf-icons bx bx-layout"></i>
                        <div data-i18n="Layouts">Layouts</div>
                    </a>

                </li>
                <!-- Category -->
                <li class="menu-item active" >
                    <a href="category.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-hive"></i>
                        <div data-i18n="Category">Category</div>
                    </a>
                </li>
                <!-- Product -->
                <li class="menu-item">
                    <a href="product.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-atom"></i>
                        <div data-i18n="Product">Product</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="blog.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bxl-blogger"></i>
                        <div data-i18n="Blog">Blog</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="banner.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-fullscreen"></i>
                        <div data-i18n="Banner">Banner</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="review.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-message-square-dots"></i>
                        <div data-i18n="Review">Review</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="customer.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-shield-alt"></i>
                        <div data-i18n="Customer">Customer</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="receipt.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-receipt"></i>
                        <div data-i18n="Receipt">Receipt</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="promotion.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bxs-discount"></i>
                        <div data-i18n="Receipt">Promotion</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="payment.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-credit-card-alt"></i>
                        <div data-i18n="Payment">Payment</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="tax.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-dollar-circle"></i>
                        <div data-i18n="Tax">Tax</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="email.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-envelope"></i>
                        <div data-i18n="Email">Email</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="size.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-outline"></i>
                        <div data-i18n="Size">Size</div>
                    </a>
                </li>
                <li class="menu-item">
                    <a href="color.html" class="menu-link">
                        <i class="menu-icon tf-icons bx bx-color-fill"></i>
                        <div data-i18n="Color">Color</div>
                    </a>
                </li>
            </ul>
        </aside>
        <!-- / Menu -->
        <!-- main data -->
        <!-- Layout container -->
        <div class="layout-page" >
            <!-- Navbar -->

            <nav
                    class="layout-navbar container-xxl navbar navbar-expand-xl navbar-detached align-items-center bg-navbar-theme"
                    id="layout-navbar"
            >
                <div class="layout-menu-toggle navbar-nav align-items-xl-center me-3 me-xl-0 d-xl-none">
                    <a class="nav-item nav-link px-0 me-xl-4" href="javascript:void(0)">
                        <i class="bx bx-menu bx-sm"></i>
                    </a>
                </div>

                <div class="navbar-nav-right d-flex align-items-center" id="navbar-collapse">
                    <h4 class="navbar-nav align-items-center"><span class="text-muted fw-light">Tables /</span>Category</h4>
                    <ul class="navbar-nav flex-row align-items-center ms-auto">
                        <!-- Place this tag where you want the button to render. -->
                        <!-- User -->
                        <li class="nav-item navbar-dropdown dropdown-user dropdown">
                            <a class="nav-link dropdown-toggle hide-arrow" href="javascript:void(0);" data-bs-toggle="dropdown">
                                <div class="avatar avatar-online">
                                    <img src="../assets/img/avatars/1.png" alt class="w-px-40 h-auto rounded-circle" />
                                </div>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-end">
                                <li>
                                    <a class="dropdown-item" href="#">
                                        <div class="d-flex">
                                            <div class="flex-shrink-0 me-3">
                                                <div class="avatar avatar-online">
                                                    <img src="../assets/img/avatars/1.png" alt class="w-px-40 h-auto rounded-circle" />
                                                </div>
                                            </div>
                                            <div class="flex-grow-1">
                                                <span class="fw-semibold d-block">John Doe</span>
                                                <small class="text-muted">Admin</small>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <div class="dropdown-divider"></div>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">
                                        <i class="bx bx-user me-2"></i>
                                        <span class="align-middle">My Profile</span>
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">
                                        <i class="bx bx-cog me-2"></i>
                                        <span class="align-middle">Settings</span>
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">
                        <span class="d-flex align-items-center align-middle">
                          <i class="flex-shrink-0 bx bx-credit-card me-2"></i>
                          <span class="flex-grow-1 align-middle">Billing</span>
                          <span class="flex-shrink-0 badge badge-center rounded-pill bg-danger w-px-20 h-px-20">4</span>
                        </span>
                                    </a>
                                </li>
                                <li>
                                    <div class="dropdown-divider"></div>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="auth-login-basic.html">
                                        <i class="bx bx-power-off me-2"></i>
                                        <span class="align-middle">Log Out</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <!--/ User -->
                    </ul>
                </div>
            </nav>

            <!-- / Navbar -->

            <!-- Content wrapper -->
            <div class="content-wrapper" >
                <!-- Content -->

                <div class="container-xxl flex-grow-1 container-p-y" id="blur-action">
                    <!-- Basic Bootstrap Table -->
                    <div class="card">
                        <div style="display: flex; flex-direction: row; justify-content: space-between; align-items:center ; padding: 10px;">
                            <div class="col-md-3">
                                <form id="searchForm" action="/payment/search" style="display: flex;flex-direction: row" method="post">
                                    <input class="form-control" type="text" name="keyword" id="searchTerm"/>
                                    <button class="btn btn-primary btn" style="margin-left: 30px" onclick="search()">search</button>
                                </form>
                            </div>
                            <button id="CreateBtn" type="button" class="btn btn-primary" style="margin-right: 20px;" onclick="clickCreateToggle()">Create</button>
                        </div>
                        <div class="table-responsive text-nowrap">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th>Payment Method ID</th>
                                    <th>Payment Method Name</th>
                                    <th>Description</th>
                                    <th>Update Date</th>
                                    <th>Create Date</th>
                                    <th>Status</th>
                                    <th>Actions</th>
                                </tr>
                                </thead>
                                <tbody class="table-border-bottom-0">
                                <c:if test="${paymentList == null}">
                                    <div class="alert alert-danger">
                                        <p>Không có dữ liệu</p>
                                    </div>
                                </c:if>
                                <c:if test="${paymentList != null}">
                                    <c:forEach var="payment" items="${paymentList}">
                                        <tr>
                                            <td><i class="fab fa-angular fa-lg text-danger me-3"></i> <strong>${payment.id}</strong></td>
                                            <td>${payment.name}</td>
                                            <td>${payment.description}</td>
                                            <td>
                                                    ${payment.createDate}
                                            </td>
                                            <td>
                                                    ${payment.updateDate}
                                            </td>
                                            <td><span class="badge bg-label-primary me-1">Active</span></td>
                                            <td>
                                                <div class="dropdown">
                                                    <button type="button" class="btn p-0 dropdown-toggle hide-arrow" data-bs-toggle="dropdown">
                                                        <i class="bx bx-dots-vertical-rounded"></i>
                                                    </button>
                                                    <div class="dropdown-menu">
                                                        <a class="dropdown-item" id="edit_btn" onclick="btnEdit(${payment.id})" href="javascript:void(0);">
                                                            <i class="bx bx-edit-alt me-1"></i>
                                                            Edit
                                                        </a>
                                                        <a class="dropdown-item" onclick="deletePayment(${payment.id})" href="javascript:void(0);"
                                                        ><i class="bx bx-trash me-1"></i> Delete</a
                                                        >
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </c:if>

                                </tbody>
                            </table>
                        </div>
                    </div>

                </div>
                <!-- / Content -->
                <!--/ Basic Bootstrap Table -->
                <form id="updateForm" action="/payment/updatePayment" method="post">
                    <div class="d-flex aligns-items-center justify-content-center card text-left w-50 position-absolute top-50 start-50 translate-middle-x" id="product_edit" style="margin-left: 100px;margin-top: -15%;;" aria-hidden="true">
                        <div class="card mb-4">
                            <div style="display: flex; flex-direction: row; justify-content: space-between; align-items:center ;">
                                <h5 class="card-header">Edit Discount Code</h5>
                                <button id="EditBtn" type="button" class="btn btn-danger" style="margin-right: 20px;" onclick="clickEditToggle()">Cancel</button>
                            </div>
                            <div class="card-body" style="margin-top: -3%;">
                                <div class="mb-3">
                                    <label  class="form-label">Discount Id</label>
                                    <input
                                            class="form-control"
                                            type="text"
                                            id="edit_id"
                                            name="id"
                                            readonly
                                    />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Discount Name</label>
                                    <input
                                            type="text"
                                            class="form-control"
                                            placeholder="brand name"
                                            id="edit_name"
                                            name="name"
                                            required="required"
                                    />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Description</label>
                                    <input
                                            type="text"
                                            class="form-control"
                                            placeholder="brand name"
                                            id="edit_description"
                                            name="description"
                                            required="required"
                                    />
                                </div>
                                <div class="row mt-3">
                                    <div class="d-grid gap-2 col-lg-6 mx-auto">
                                        <button class="btn btn-primary btn-lg" onclick="updatePayment()" type="button">Save</button>
                                    </div>
                                    <div class="d-grid gap-2 col-lg-6 mx-auto">
                                        <button class="btn btn-danger btn-lg" onclick="clickEditToggle()" type="button">Cancel</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                <!--/ Responsive Table -->
                <!--/ Create Table -->
                <form id="saveForm" action="/payment/savePayment" method="post" enctype="multipart/form-data">
                    <div class="d-flex aligns-items-center justify-content-center card text-left w-50 position-absolute top-50 start-50 translate-middle-x" id="create-product" style="margin-left: 100px;margin-top: -15%;;" aria-hidden="true">
                        <div class="card mb-4">
                            <div style="display: flex; flex-direction: row; justify-content: space-between; align-items:center ;">
                                <h5 class="card-header">Create Payment Method</h5>
                                <button id="addBtn" type="button" class="btn btn-danger" style="margin-right: 20px;" onclick="clickCreateToggle()">Cancel</button>
                            </div>
                            <div class="card-body" style="margin-top: -3%;">
                                <div class="mb-3">
                                    <label class="form-label">Name Payment</label>
                                    <input
                                            type="text"
                                            class="form-control"
                                            placeholder="payment name"
                                            name="name"
                                            required="required"
                                    />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Description</label>
                                    <input
                                            type="text"
                                            class="form-control"
                                            placeholder="discount name"
                                            name="description"
                                            required="required"
                                    />
                                </div>
                                <div class="mb-3">
                                    <div class="row mt-3">
                                        <div class="d-grid gap-2 col-lg-6 mx-auto">
                                            <button class="btn btn-primary btn-lg" value="Submit" type="submit" >Save</button>
                                        </div>
                                        <div class="d-grid gap-2 col-lg-6 mx-auto">
                                            <button class="btn btn-danger btn-lg" type="button" onclick="clickCreateToggle()">Cancel</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                <!--/ create Table -->
                <!-- Footer -->
                <footer class="content-footer footer bg-footer-theme">

                </footer>
                <!-- / Footer -->

                <div class="content-backdrop fade"></div>
            </div>
            <!-- Content wrapper -->
        </div>
        <!-- / Layout page -->
    </div>

    <!-- Overlay -->
    <div class="layout-overlay layout-menu-toggle"></div>
</div>
<!-- / Layout wrapper -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js" integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/js/bootstrap.min.js" integrity="sha512-1/RvZTcCDEUjY/CypiMz+iqqtaoQfAITmNSJY17Myp4Ms5mdxPS5UV7iOfdZoxcGhzFbOm6sntTKJppjvuhg4g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.perfect-scrollbar/1.5.5/perfect-scrollbar.min.js" integrity="sha512-X41/A5OSxoi5uqtS6Krhqz8QyyD8E/ZbN7B4IaBSgqPLRbWVuXJXr9UwOujstj71SoVxh5vxgy7kmtd17xrJRw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<script src="../assets/vendor/js/menu.js"></script>
<!-- Main JS -->
<script src="../assets/js/main.js"></script>

<!-- Page JS -->
<script src="../js/hidden.js"></script>
<script src="../js/payment.js"></script>

<script async defer src="https://buttons.github.io/buttons.js"></script>
</body>
</html>