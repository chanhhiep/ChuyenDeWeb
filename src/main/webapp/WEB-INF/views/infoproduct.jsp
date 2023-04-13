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
    <meta charset="UTF-8">
    <title>Thông tin sản phẩm</title>
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
    <link rel='stylesheet prefetch' href='https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css'>
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
<main>
    <div class="container">
        <div class="clear10"></div>
        <div class="clear10"></div>
        <div class="clear10"></div>
        <!---->
        <div class="padmb">
            <div class="hinhsp">
                <img class=" lazyloaded"
                     alt="Nike M2k Trắng Gót Đỏ Nam, Nữ" width="500" height="500"
                     src="images/sp/nike-m2k-trang-got-do-nam-nu.jpg">
            </div>
            <div class="infosp">
                <div class="ten">Nike M2k Trắng Gót Đỏ Nam, Nữ</div>
                <a class="rew" href="/" title="Đánh giá Nike M2k Trắng Gót Đỏ Nam, Nữ">
                    <span>
                        <i class="iconcom-star"></i>
                        <i class="iconcom-star"></i>
                        <i class="iconcom-star"></i>
                        <i class="iconcom-star"></i>
                        <i class="iconcom-star"></i>
                    </span>
                    <span> (đánh giá)</span>
                </a>
                <div class="clear"></div>
                <div class="brand">
                    <p>Brand: <a href="giay-nike" title="Nike" rel="nofollow">Nike</a></p>
                    <p class="code">Code/Sku: <b>M2K3</b></p>
                    <p class="code">Views: <b>8,981</b></p>
                </div>
                <div class="clear"></div>
                <div id="setPrice"><p class="price">900,000<sup>đ</sup></p>
                    <p class="company"><span>1,950,000</span></p>
                    <p class="discount">GIẢM 1,050,000₫</p></div>
                <div class="clear"></div>
                <div class="khuyenmai">
                    <ul>
                        <li><strong>Trạng thái :</strong> Còn hàng</li>
                        <li><strong>Tình trạng :</strong> Hàng mới 100%</li>
                    </ul>
                </div>
                <div class="choosesize ">
                    <p>Chọn size: </p>
                    <ul class="ulsize">
                        <li>36</li>
                        <li>37</li>
                        <li>38</li>
                        <li>39</li>
                        <li>40</li>
                        <li>41</li>
                        <li>42</li>
                        <li>43</li>
                        <li>44</li>
                    </ul>
                </div>
                <form class="product " name="Order">
                    <div class="soluongsp">
                        <input id="qty" name="quantity" type="number" class="soluong" value="1" max="10">
                        <div class="upqty" onclick="updownqty('up');">+</div>
                        <div class="downqty" onclick="updownqty('down');">–</div>
                        <span>(Chọn số lượng)</span>
                    </div>
                    <input class="sizesp" name="sizesp" type="hidden" value="" id="size">
                    <input type="hidden" name="giaban" class="giabansp" value="">
                    <input type="hidden" name="giacty" class="giactysp" value="">
                    <input type="hidden" name="product_id" value="">
                    <div class="clear"></div>
                    <input type="submit" class="buynow" value="Mua ngay">
                    <a href="gio-hang.html" class="intocart">Thêm vào giỏ</a>
                    <a class="wishlist" href="wishlist.html">Danh sách yêu thích</a>
                </form>
                <div class="clear10"></div>

            </div>
            <div class="clear10"></div>
            <span id="element_sale"></span>
        </div>
        <div class="clear"></div>
        <div class="clear"></div>
        <div class="clear"></div>
        <div class="clear"></div>

        <div class="stars">
            <h1>Xếp hạng và đánh giá</h1>
            <div class="Star-Ratings">
                <div class="inner">
                    <div class="rating">
                        <span class="rating-num">4.0</span>
                        <div class="rating-star">
                            <span><i class="active icon-star"></i></span>
                            <span><i class="active icon-star"></i></span>
                            <span><i class="active icon-star"></i></span>
                            <span><i class="active icon-star"></i></span>
                            <span><i class="icon-star"></i></span>
                        </div>
                        <div class="rating-users">
                            <i class="icon-user"></i> 1000 total
                        </div>
                    </div>
                    <div class="histo">
                        <div class="five histo-rate">
                            <span class="histo-star">
                                <i class="active icon-star"></i> 5
                            </span>
                            <span class="bar-block">
                                <span id="bar-five" class="bar">
                                    <span>554</span>&nbsp;</span>
                            </span>
                        </div>

                        <div class="four histo-rate">
                            <span class="histo-star">
                                <i class="active icon-star"></i> 4
                            </span>
                            <span class="bar-block">
                                <span id="bar-four" class="bar">
                                    <span>171</span>&nbsp;</span>
                            </span>
                        </div>

                        <div class="three histo-rate">
                            <span class="histo-star">
                                <i class="active icon-star"></i> 3
                            </span>
                            <span class="bar-block">
                                <span id="bar-three" class="bar">
                                    <span>94</span>&nbsp;</span>
                            </span>
                        </div>

                        <div class="two histo-rate">
                            <span class="histo-star">
                                <i class="active icon-star"></i> 2
                            </span>
                            <span class="bar-block">
                                <span id="bar-two" class="bar">
                                    <span>44</span>&nbsp;</span>
                            </span>
                        </div>

                        <div class="one histo-rate">
                            <span class="histo-star">
                                <i class="active icon-star"></i> 1
                            </span>
                            <span class="bar-block">
                                <span id="bar-one" class="bar">
                                    <span>136</span>&nbsp;
                                </span>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="reviews">
                <form action="" class="rating-wrapper">
                    <label class="rating-label">Đánh giá sản phẩm
                        <div class="ratingItemList">
                            <input class="star star-5" id="star-5" type="radio" name="star" value="5"/>
                            <label class="star star-5" for="star-5"></label>
                            <input class="star star-4" id="star-4" type="radio" name="star" value="5"/>
                            <label class="star star-4" for="star-4"></label>
                            <input class="star star-3" id="star-3" type="radio" name="star" value="5"/>
                            <label class="star star-3" for="star-3"></label>
                            <input class="star star-2" id="star-2" type="radio" name="star" value="5"/>
                            <label class="star star-2" for="star-2"></label>
                            <input class="star star-1" id="star-1" type="radio" name="star" value="5"/>
                            <label class="star star-1" for="star-1"></label>
                        </div>
                    </label>
                    <div class="feedback">
                        <textarea placeholder="Đánh giá...."></textarea>
                        <button class="submit">Đăng</button>
                    </div>
                </form>
            </div>
            <div class="cmt">
                <ul class="ratingLst">
                    <li>
                        <div class="rh">
                            <span>NVA</span>
                            <label>
                                <i></i>
                            </label>
                        </div>
                        <div class="rc">
                            <p>
                                <span>
                                    <i class="iconcom-star"></i>
                                     <i class="iconcom-star"></i>
                                     <i class="iconcom-star"></i>
                                     <i class="iconcom-star"></i>
                                     <i class="iconcom-star"></i>
                                </span>
                                <i>Good</i>
                            </p>
                        </div>
                        <div class="ra">
                            <a title="like">
                                <i></i>like
                                <span> - </span>
                                <span>3h trước</span>
                            </a>
                        </div>
                        <div class="clear"></div>
                        <div class="ro">
                            <p>
                                <img class="ls-is-cached lazyloaded" src="images/logomb.png" width="24" height="24"
                                     alt="">
                                ok
                            </p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
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
<script>
    $('button.submit').disabled = true;	// disable button on load

    // Enable button
    function enable_submit() {
        $('button.submit').disabled = false;
        $('button.submit').addClass('not-disabled');
    }

    // Disable button
    function disable_submit() {
        $('button.submit').disabled = true;
        $('button.submit').removeClass('not-disabled');
    }

    // Display feedback after rating
    $('.star').on('click', function () {
        var rating = this['value'];

        $('.feedback').css('display', "block");

        feedback_validate(rating);

    });

    // Run enable button function based on input
    $('.feedback textarea').keyup(function () {
        if ($('.feedback textarea').val().length > 3) {
            enable_submit();
        }
    });

    // Enable or disable button by validation
    function feedback_validate(val) {
        if (val <= 3) {
            disable_submit();

        } else if (val > 3) {
            enable_submit();
        }
    }

    $(document).ready(function () {
        $('.bar span').hide();
        $('#bar-five').animate({
            width: '75%'
        }, 1000);
        $('#bar-four').animate({
            width: '35%'
        }, 1000);
        $('#bar-three').animate({
            width: '20%'
        }, 1000);
        $('#bar-two').animate({
            width: '15%'
        }, 1000);
        $('#bar-one').animate({
            width: '30%'
        }, 1000);

        setTimeout(function () {
            $('.bar span').fadeIn('slow');
        }, 1000);

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
<script src="test.js"></script>

</body>
</html>
