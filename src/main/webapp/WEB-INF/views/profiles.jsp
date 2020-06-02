<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<jsp:include page="/WEB-INF/commons/include_header_css.jsp"/>
<body>
	<div class="wrapper">
		<header>
			<!-- Menubar Starts -->
			<jsp:include page="../common_top_menu.jsp"/>
			<!-- Menubar End -->
		</header>	
		<form id ="mId-List">


		<section class="companies-info">
			<div class="container">
				<div class="company-title">
					<h3><s:message code="profile.all"/></h3>
				</div><!--company-title end-->
				<div class="companies-list">
					
						<div class="row">
						<!-- loop start -->
						<c:forEach var="member" items="${memberList}" varStatus="status">
							<c:if test="${status.index!=0}">
								</div>
							</c:if>
							<div class="col-lg-3 col-md-4 col-sm-6 col-12">
								<div class="company_profile_info">
									<div class="company-up-info"  mIdYou="${member.mId}">
									<input type="hidden" name="mId" value="${member.mId}" placeholder="Id">
										<c:choose>
											<c:when test="${member.mImage==null}">
												<img src="contents/member_image/default.png" alt="">
											</c:when>	
											<c:otherwise >
												<img src="contents/member_image/${member.mImage}" alt="">
											</c:otherwise>
										</c:choose>
										<h3 class="member-id">${member.mId}</h3>
										<h4>${member.mName}</h4>
										<c:choose>
											<c:when test="${member.mId!=sessionScope.mId}">
												<ul>	
													<li><a href="#" title="" class="unFollow"><s:message code="profile.unfollow"/></a></li><!-- follow중인 상태 -->
													<li><a href="#" title="" class="follow"><s:message code="profile.follow"/></a></li>
													<li><a href="#" title="" class="message-us"><i class="fa fa-envelope"></i></a></li>
												</ul>
											</c:when>
											<c:otherwise>
												<b><s:message code="profile.my"/></b>
											</c:otherwise>
										</c:choose>
									</div>
									<c:choose>
										<c:when test="${member.mId==sessionScope.mId}">								
											<a href="personal_info" title="" class="view-more-pro"><s:message code="profile.view"/></a>
										</c:when>
										<c:otherwise>
											<a href="user-profile?youId=${member.mId}" title="" class="view-more-pro"><s:message code="profile.view"/></a>
										</c:otherwise>
									</c:choose>
								</div><!--company_profile_info end-->
								</c:forEach>
								<!-- loop end -->
							</div>
						</div>
					
				</div><!--companies-list end-->
				</form>
			</div>
		</section><!--companies-info end-->
	</div><!--theme-layout end-->



<script type="text/javascript" src="js/popper.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/flatpickr.min.js"></script>
<script type="text/javascript" src="lib/slick/slick.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/wProfiles.js"></script>
</body>
</html>