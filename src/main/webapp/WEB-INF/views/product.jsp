<%--
  Created by IntelliJ IDEA.
  User: tfska
  Date: 3/30/2023
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Shop Giày Thể Thao - Sneaker Nam, Nữ Replica </title>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
    <link rel="preload" as="style"
          href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap"
          media="all" onload="this.media='all'">
    <script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script>
    <script async="" src="//www.googletagmanager.com/gtm.js?id=GTM-WFWV3XZ"></script>
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
          integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
          crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet'
          type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap"
          media="all" onload="this.media='all'">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
          integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
          crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">

</head>
<body id="content">
<header>
    <div class="head">
        <div class="container">
            <h1>Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ</h1>
            <div class="texttop">
                <ul class="text">
                    <li><p>Free ship</p> <span>Toàn quốc</span></li>
                    <li><p>Check hàng</p> <span>Mới thanh toán</span></li>
                    <li><p>Bảo hành</p> <span>Trong 6 tháng</span></li>
                </ul>
                <ul class="top">
                    <li>
                        <a href="/wishlist" title="Danh sách yêu thích">
                            <div class="img">
                                <img src="images/wish-list.png" alt="Cập nhật danh sách yêu thích" width="24"
                                     height="24"></div>
                            <p>Wish List</p>
                        </a>
                    </li>

                </ul>
                <a href="/cart" id="cart"><i><img src="images/ico_cart.svg" alt="Thông tin đơn hàng" width="15"
                                                  height="15"></i><span>( 0 sản phẩm )</span></a>
            </div>
            <div class="clear"></div>
            <div class="header">
                <div class="logo">
                    <a href="/home" title="Trang chủ | Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ">
                        <img src="images/logo.png" alt="Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ"
                             width="261"
                             height="50"></a></div>
                <div class="logomb">
                    <a href="/home" title="Trang chủ | Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ">
                        <img src="images/logo.png" alt="Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ"
                             width="47" height="36"></a>
                </div>
                <div class="account">
                    <a href="/login" title="Đăng ký &amp; tạo tài khoản">
                        <img src="images/user.svg" alt="Tài khoản thành viên" height="36" width="36"
                             class="default"><span>Đăng ký / đăng nhập</span>
                        <p class="capdo"><i>Nhận ngay ưu đãi</i></p></a>
                    <p><a href="/" title="Đăng ký &amp; tạo tài khoản"></a></p></div>
                <div class="search">
                    <form action="tim-kiem" method="get" target="_top"><input type="text" name="key"
                                                                              placeholder="Nhập gợi ý từ khóa...">
                        <input type="submit" value="Tìm kiếm">
                        <ul class="search_result"></ul>
                    </form>
                </div>
                <a href="/cart" title="Giỏ hàng của bạn" class="cartmb"><span>0</span></a>
                <a class="togglemenu">Menu</a>
                <nav class="subnav">
                    <ul class="navigation">
                        <li class="category" href="/product"
                            title="Shop giày thể thao Adidas nam nữ mới nhất 2022"><a>Adidas</a></li>

                        <li class="category" href="/product"
                            title="Giày Thể Thao Nike Chính Hãng Nam Nữ Đẹp Giá Giảm 25%"><a>Nike</a></li>

                        <li class="category" href="/product"
                            title="Giày Sneaker MLB Korea Nam Nữ Mới Giá Rẻ Giảm 25%"><a>MLB Korea</a></li>

                        <li class="category" href="/product"
                            title="Giày New Balance Chất Lượng Siêu Cấp Giá Rẻ Giảm 20%"><a>New Balance</a></li>

                        <li class="category" href="/product"
                            title="Giày Sneaker McQueen Mới Nhất | Chuẩn Đẹp Giảm 25%"><a>McQueen</a></li>

                        <li class="category" href="/product"
                            title="Giày Converse Vietnam: Chuck Taylor 1970s Nam Nữ Giá Rẻ"><a>Converse</a></li>

                        <li class="category" href="/product"
                            title="Store Giày Vans Việt Nam: Old Skool, Slip On, Vault, Classic, Marvel"><a>VANS</a>
                        </li>

                        <ul class="linknews">
                            <li><a href="/" title="Thông tin giới thiệu">Giới thiệu</a></li>
                            <li><a href="/"
                                   title="Chia sẻ kinh nghiệm hay về giày thể thao">
                                Chia sẻ kinh nghiệm hay <label>Mới</label></a></li>
                            <li><a href="/" title="Tin tức - tư vấn giày thể thao">Tin tức - tư
                                vấn </a>
                            </li>
                            <li><a href="/" title="Thông tin liên hệ">Liên hệ</a></li>
                        </ul>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="menufix no-scroll">
        <nav id="menu" class="menu">
            <div class="container">
                <ul>
                    <li><a href="/home" title="Giới thiệu"><span class="brand"><img
                            src="images/gioi-thieu.png" alt="Giới thiệu" width="33" height="24"></span>Trang chủ</a>
                    </li>
                    <li><a href="/product" title="Adidas"><span class="brand"><img
                            src="images/adidas.png" alt="Adidas" width="40" height="24"></span>Adidas</a>
                        <ul>
                            <li><a href="/product" title="Ultra Boost">Ultra Boost</a></li>
                            <li><a href="/product" title="Yeezy">Yeezy</a></li>
                            <li><a href="/product" title="ZX 5K Boost">ZX 5K Boost</a></li>
                            <li><a href="/product" title="Alpha Magma">Alpha Magma</a></li>
                            <li><a href="/product" title="EQT+">EQT+</a></li>
                            <li><a href="/product" title="ZX 2K Boost">ZX 2K Boost</a></li>
                            <li><a href="/product" title="Alphabounce">Alphabounce</a></li>
                            <li><a href="/product" title="X9000L4">X9000L4</a></li>
                            <li><a href="/product" title="Stan Smith">Stan Smith</a></li>
                            <li><a href="/product" title="Prophere">Prophere</a></li>
                            <li><a href="/product" title="Superstar">Superstar</a></li>
                            <li><a href="/product" title="NMD Humanrace">NMD Humanrace</a></li>
                            <li><a href="/product" title="Ozweego">Ozweego</a></li>
                            <li><a href="/product" title="Adidas Yung">Adidas Yung</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/product" title="Nike"><span class="brand">
                        <img src="images/nike.png" alt="Nike" width="40" height="24"></span>Nike</a>
                        <ul>
                            <li><a href="/product" title="SB Dunk">SB Dunk</a></li>
                            <li><a href="/product" title="Jordan">Jordan</a></li>
                            <li><a href="/product" title="Air Force 1">Air Force 1</a></li>
                            <li><a href="/product" title="Blazer">Blazer</a></li>
                            <li><a href="/product" title="Pegasus">Pegasus</a></li>
                            <li><a href="/product" title="Air Max">Air Max</a></li>
                            <li><a href="/product" title="Joyride">Joyride</a></li>
                            <li><a href="/product" title="M2K">M2K</a></li>
                            <li><a href="/product" title="Uptempo">Uptempo</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/product" title="MLB Korea"><span class="brand">
                        <img src="images/mlb.png" alt="MLB Korea" width="40" height="24"></span>MLB Korea</a>
                    </li>
                    <li><a href="/product" title="New Balance"><span class="brand"><img
                            src="images/new-balance.png" alt="New Balance" width="40" height="24"></span>New
                        Balance</a>
                        <ul>
                            <li><a href="/product" title="New Balance 300">New Balance 300</a></li>
                            <li><a href="/product" title="New Balance 550">New Balance 550</a></li>
                            <li><a href="/product" title="New Balance 574">New Balance 574</a></li>
                        </ul>
                    </li>
                    <li><a href="/product" title="McQueen"><span class="brand"><img
                            src="images/mcqueen.png" alt="McQueen" width="40" height="24"></span>McQueen</a>
                    </li>
                    <li><a href="/product" title="Converse"><span class="brand"><img
                            src="images/converse.png" alt="Converse" width="40" height="24"></span>Converse</a>
                    </li>
                    <li><a href="/product" title="VANS"><span class="brand">
                        <img src="images/vans.png" alt="VANS" width="40" height="24"></span>VANS</a>
                    </li>
                    <li><a href="/product" title="Sale Off" class="sale"><span class="brand"><img
                            src="images/sale-off.png" alt="Sale Off" width="40" height="24"></span>Sale Off</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</header>
<span id="element_slide"></span>

<main>
    <div class="container">
        <div class="sub_category">
            <ul>
                <li>
                    <a href="/product" title="Giày Adidas Ultra Boost Nam Nữ Mới Giảm Giá Sốc 20%">Ultra
                        Boost</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas Yeezy Boost - Ship Cod Toàn Quốc">Yeezy</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas ZX5K Boost Nén Full Box Chuẩn Siêu Cấp Freeship">ZX 5K
                        Boost</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas EQ21 Run Chuẩn Siêu Cấp Full Size Giảm 25%">EQ21 Run</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas Alpha Magma Chuẩn Siêu Cấp Giảm 25%">Alpha Magma</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas Equipment Plus (EQT+) Chuẩn Đẹp Giảm Giá 25%">EQT+</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas ZX 2K Boost Nam Nữ Chuẩn Đẹp Giá Rẻ Giảm Sốc 20%">ZX 2K
                        Boost</a>
                </li>
                <li>
                    <a href="/product" title="Giày Thể Thao Adidas Alphabounce Mới Giá Rẻ Giảm 20%">Alphabounce</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas X9000L4 Chất Lượng, Giảm 25%">X9000L4</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas Stan Smith Nam Nữ Giá Học Sinh">Stan Smith</a>
                </li>
                <li>
                    <a href="/product"
                       title="Giày Adidas Prophere Nam Nữ Siêu Cấp Giá Rẻ Sale 20%">Prophere</a>
                </li>
                <li><a href="/product" title="Giày Thể Thao Adidas Superstar Nam Nữ Giá Giảm 25%">Superstar</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas NMD Human Race Nam Nữ Giá Rẻ Giảm 20%">NMD Humanrace</a>
                </li>
                <li>
                    <a href="/product" title="Giày Sneaker Adidas Ozweego Nam &amp; Nữ Giá Rẻ Giảm 20%">Ozweego</a>
                </li>
                <li>
                    <a href="/product" title="Giày Adidas Yung 1 Super Fake &amp; Replica 1:1 Nam Nữ Giá Rẻ Mới">Adidas
                        Yung</a>
                </li>
            </ul>
        </div>
        <div class="grid_column-10">
            <div class="home-filter">
                <span class="home-filter_label">9 (sản phẩm)</span>
                <div class="select-input">
                    <span class="select-input--primary"> Sắp xếp theo</span>
                    <i class="select-input_icon fas fa-angle-down"></i>
                    <ul class="select-input_list">
                        <li class="select-input_item">
                            <a href="#" class="select-input_link">Tên: A - Z</a>
                        </li>
                        <li class="select-input_item">
                            <a href="#" class="select-input_link">Tên: Z - A</a>
                        </li>
                        <li class="select-input_item">
                            <a href="#" class="select-input_link">Giá: Thấp đến cao</a>
                        </li>
                        <li class="select-input_item">
                            <a href="#" class="select-input_link">Giá: Cao đến thấp</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="clear"></div>
        <div class="padmb_1">
            <ul class="listsp_1">
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"
                                 alt="Nike Air Jordan 1 High Trophy Room Freeze Out"
                                 src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"></a>
                    </div>
                    <div class="info">
                        <h3>
                            <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">Nike Air Jordan 1 High
                                Trophy Room Freeze Out</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Dark Mocha Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Dark Mocha Pk God"
                                 src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Dark Mocha Pk God">Nike Air Jordan 1 High Dark Mocha Pk
                            God</a></h3>
                        <p>1,700,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"
                                 alt="Nike Air Jordan 1 High University Blue Like Auth"
                                 src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">Nike Air Jordan 1 High
                            University Blue Like Auth</a></h3>
                        <p>1,600,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"
                                 alt="Nike Air Jordan 1 Deflant SB NYC to Paris"
                                 src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">Nike Air Jordan 1 Deflant SB
                            NYC to Paris</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"
                                 alt="Nike Air Jordan 1 High Zoom CMFT Pink Oxford"
                                 src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">Nike Air Jordan 1 High Zoom
                            CMFT Pink Oxford</a></h3>
                        <p>1,200,000<sup>đ</sup><span>1,450,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott Pk God"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">Nike Air Jordan 1 High Travis
                            Scott Pk God</a></h3>
                        <p>1,500,000<sup>đ</sup><span>1,950,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Black White'">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"
                                 alt="Nike Air Jordan 1 High 'Black White'"
                                 src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High 'Black White'">Nike Air Jordan 1 High 'Black White'</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">
                            <img
                                    width="234" height="234" class=" lazyloaded"
                                    data-src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"
                                    alt="Nike Air Jordan 1 High 'Dior'"
                                    src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">Nike Air Jordan 1 High 'Dior'</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,440,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product"
                           title="Nike Air Jordan 1 High Travis Scott x Fragment">
                            <img width="234" height="234"
                                 class="lazy"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott x Fragment"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Travis Scott x Fragment">Nike Air Jordan 1 High Travis
                            Scott x Fragment</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>

                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"
                                 alt="Nike Air Jordan 1 High Trophy Room Freeze Out"
                                 src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"></a>
                    </div>
                    <div class="info">
                        <h3>
                            <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">Nike Air Jordan 1 High
                                Trophy Room Freeze Out</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Dark Mocha Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Dark Mocha Pk God"
                                 src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Dark Mocha Pk God">Nike Air Jordan 1 High Dark Mocha Pk
                            God</a></h3>
                        <p>1,700,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"
                                 alt="Nike Air Jordan 1 High University Blue Like Auth"
                                 src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">Nike Air Jordan 1 High
                            University Blue Like Auth</a></h3>
                        <p>1,600,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"
                                 alt="Nike Air Jordan 1 Deflant SB NYC to Paris"
                                 src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">Nike Air Jordan 1 Deflant SB
                            NYC to Paris</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"
                                 alt="Nike Air Jordan 1 High Zoom CMFT Pink Oxford"
                                 src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">Nike Air Jordan 1 High Zoom
                            CMFT Pink Oxford</a></h3>
                        <p>1,200,000<sup>đ</sup><span>1,450,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott Pk God"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">Nike Air Jordan 1 High Travis
                            Scott Pk God</a></h3>
                        <p>1,500,000<sup>đ</sup><span>1,950,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Black White'">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"
                                 alt="Nike Air Jordan 1 High 'Black White'"
                                 src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High 'Black White'">Nike Air Jordan 1 High 'Black White'</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">
                            <img
                                    width="234" height="234" class=" lazyloaded"
                                    data-src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"
                                    alt="Nike Air Jordan 1 High 'Dior'"
                                    src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">Nike Air Jordan 1 High 'Dior'</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,440,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product"
                           title="Nike Air Jordan 1 High Travis Scott x Fragment">
                            <img width="234" height="234"
                                 class="lazy"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott x Fragment"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Travis Scott x Fragment">Nike Air Jordan 1 High Travis
                            Scott x Fragment</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>

                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"
                                 alt="Nike Air Jordan 1 High Trophy Room Freeze Out"
                                 src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"></a>
                    </div>
                    <div class="info">
                        <h3>
                            <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">Nike Air Jordan 1 High
                                Trophy Room Freeze Out</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Dark Mocha Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Dark Mocha Pk God"
                                 src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Dark Mocha Pk God">Nike Air Jordan 1 High Dark Mocha Pk
                            God</a></h3>
                        <p>1,700,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"
                                 alt="Nike Air Jordan 1 High University Blue Like Auth"
                                 src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">Nike Air Jordan 1 High
                            University Blue Like Auth</a></h3>
                        <p>1,600,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"
                                 alt="Nike Air Jordan 1 Deflant SB NYC to Paris"
                                 src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">Nike Air Jordan 1 Deflant SB
                            NYC to Paris</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"
                                 alt="Nike Air Jordan 1 High Zoom CMFT Pink Oxford"
                                 src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">Nike Air Jordan 1 High Zoom
                            CMFT Pink Oxford</a></h3>
                        <p>1,200,000<sup>đ</sup><span>1,450,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott Pk God"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">Nike Air Jordan 1 High Travis
                            Scott Pk God</a></h3>
                        <p>1,500,000<sup>đ</sup><span>1,950,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Black White'">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"
                                 alt="Nike Air Jordan 1 High 'Black White'"
                                 src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High 'Black White'">Nike Air Jordan 1 High 'Black White'</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">
                            <img
                                    width="234" height="234" class=" lazyloaded"
                                    data-src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"
                                    alt="Nike Air Jordan 1 High 'Dior'"
                                    src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">Nike Air Jordan 1 High 'Dior'</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,440,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product"
                           title="Nike Air Jordan 1 High Travis Scott x Fragment">
                            <img width="234" height="234"
                                 class="lazy"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott x Fragment"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Travis Scott x Fragment">Nike Air Jordan 1 High Travis
                            Scott x Fragment</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>

                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"
                                 alt="Nike Air Jordan 1 High Trophy Room Freeze Out"
                                 src="images/sp/nike-air-jordan-1-high-trophy-room-freeze-out.jpg"></a>
                    </div>
                    <div class="info">
                        <h3>
                            <a href="/info-product" title="Nike Air Jordan 1 High Trophy Room Freeze Out">Nike Air Jordan 1 High
                                Trophy Room Freeze Out</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Dark Mocha Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Dark Mocha Pk God"
                                 src="images/sp/nike-air-jordan-1-high-dark-mocha-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Dark Mocha Pk God">Nike Air Jordan 1 High Dark Mocha Pk
                            God</a></h3>
                        <p>1,700,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"
                                 alt="Nike Air Jordan 1 High University Blue Like Auth"
                                 src="images/sp/nike-air-jordan-1-high-university-blue-like-auth.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High University Blue Like Auth">Nike Air Jordan 1 High
                            University Blue Like Auth</a></h3>
                        <p>1,600,000<sup>đ</sup><span>2,100,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"
                                 alt="Nike Air Jordan 1 Deflant SB NYC to Paris"
                                 src="images/sp/nike-air-jordan-1-deflant-sb-nyc-to-paris.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 Deflant SB NYC to Paris">Nike Air Jordan 1 Deflant SB
                            NYC to Paris</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">
                            <img width="234" height="234"
                                 class=" ls-is-cached lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"
                                 alt="Nike Air Jordan 1 High Zoom CMFT Pink Oxford"
                                 src="images/sp/nike-air-jordan-1-high-zoom-cmft-pink-oxford.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Zoom CMFT Pink Oxford">Nike Air Jordan 1 High Zoom
                            CMFT Pink Oxford</a></h3>
                        <p>1,200,000<sup>đ</sup><span>1,450,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Đang hot</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott Pk God"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-pk-god.jpg"></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High Travis Scott Pk God">Nike Air Jordan 1 High Travis
                            Scott Pk God</a></h3>
                        <p>1,500,000<sup>đ</sup><span>1,950,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Black White'">
                            <img width="234" height="234"
                                 class=" lazyloaded"
                                 data-src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"
                                 alt="Nike Air Jordan 1 High 'Black White'"
                                 src="images/sp/nike-air-jordan-1-high-black-white-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High 'Black White'">Nike Air Jordan 1 High 'Black White'</a>
                        </h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">
                            <img
                                    width="234" height="234" class=" lazyloaded"
                                    data-src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"
                                    alt="Nike Air Jordan 1 High 'Dior'"
                                    src="images/sp/nike-air-jordan-1-retro-high-dior-1-1.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product" title="Nike Air Jordan 1 High 'Dior'">Nike Air Jordan 1 High 'Dior'</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,440,000</span></p>
                    </div>
                </li>
                <li>
                    <div class="images">
                        <div class="ribbon"><span>Hàng mới</span></div>
                        <a href="/info-product"
                           title="Nike Air Jordan 1 High Travis Scott x Fragment">
                            <img width="234" height="234"
                                 class="lazy"
                                 data-src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"
                                 alt="Nike Air Jordan 1 High Travis Scott x Fragment"
                                 src="images/sp/nike-air-jordan-1-high-travis-scott-x-fragment.jpg"><span
                                class="star"><i class="iconcom-star"></i><i class="iconcom-star"></i><i
                                class="iconcom-star"></i><i class="iconcom-star"></i><i class="iconcom-star"></i></span></a>
                    </div>
                    <div class="info">
                        <h3><a href="/info-product"
                               title="Nike Air Jordan 1 High Travis Scott x Fragment">Nike Air Jordan 1 High Travis
                            Scott x Fragment</a></h3>
                        <p>1,100,000<sup>đ</sup><span>1,320,000</span></p>
                    </div>
                </li>
                <div class="clear10"></div>
            </ul>
            <ul class="listPage">
                <li class="active">1</li>
                <li>2</li>
                <li>3</li>
            </ul>
        </div>
        <div class="clear"></div>

    </div>
</main>

<div class="clear"></div>
<footer>
    <div class="container">
        <div class="col listkey"><p>Bạn nên xem thêm</p>
            <ul>
                <li>
                    <a href="#" title="Hướng dẫn chọn cỡ giày">Hướng dẫn chọn cỡ giày</a>
                </li>
                <li>
                    <a href="#" title="Chính sách đổi trả/ hoàn tiền">Chính sách đổi trả/ hoàn tiền</a>
                </li>
                <li>
                    <a href="#" title="Chính sách bảo mật thông tin">Chính sách bảo mật thông tin</a>
                </li>
                <li>
                    <a href="#" title="Chính sách bảo hành">Chính sách bảo hành</a></li>
                <li>
                    <a href="#" title="Hướng dẫn mua hàng">Hướng dẫn mua hàng</a>
                </li>
                <li>
                    <a href="#" title="Chính sách&nbsp;thanh toán">Chính sách vận chuyển &amp;&nbsp;thanh toán</a>
                </li>
            </ul>
        </div>
        <div class="col listkey small">
            <p>Thông tin khác</p>
            <ul>
                <li><a href="#" title="Giới thiệu">Giới thiệu</a></li>
                <li><a href="#" title="Liên hệ">Liên hệ</a></li>
            </ul>
            <div class="clear10"></div>
        </div>
        <div class="col phot">
            <b>Gọi mua hàng (08:30-21:30)</b>
            <p><img src="images/phone.svg" alt="Liên hệ đặt hàng" width="22" height="22">0344660857</p>
            <span>Tất cả các ngày trong tuần</span>
        </div>
        <div class="col large">
            <div class="fb-page fb_iframe_widget" data-small-header="false" data-adapt-container-width="true"
                 data-hide-cover="false"
                 data-show-facepile="true" data-width="500" height="400" fb-xfbml-state="rendered">
            </div>
        </div>
    </div>
</footer>
<div class="footer">
    <a class="btn-top" href="javascript:void(0);" title="Top" style="display: inline;">
        <i class="fa fa-arrow-up" aria-hidden="true"></i>
    </a>
</div>

<script>
    $(document).ready(function ($) {
        if ($(".btn-top").length > 0) {
            $(window).scroll(function () {
                var e = $(window).scrollTop();
                if (e > 500) {
                    $(".btn-top").show()
                } else {
                    $(".btn-top").hide()
                }
            });
            $(".btn-top").click(function () {
                $('body,html').animate({scrollTop: 0}, 1000)
            })
        }
    });
</script>

<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script
        src="https://code.jquery.com/jquery-3.6.3.js"
        integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
        crossorigin="anonymous">
</script>
<!-- Latest jQuery form server -->
<script src="https://code.jquery.com/jquery.min.js"></script>

<!-- Bootstrap JS form CDN -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!-- Slider -->
<script type="text/javascript" src="js/script.slider.js"></script>
<script src="test.js"></script>
<script src="page.js"></script>
</body>
</html>