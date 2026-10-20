.class public final Ll/u1;
.super Ll/o1;

# interfaces
.implements Ll/p1;


# static fields
.field public static final G:Ljava/lang/reflect/Method;


# instance fields
.field public F:Ll/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/u1;->G:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "MenuPopupWindow"

    const-string v1, "Could not find method setTouchModal() on PopupWindow. Oh well."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public final d(Lk/l;Lk/m;)V
    .locals 1

    iget-object v0, p0, Ll/u1;->F:Ll/p1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/p1;->d(Lk/l;Lk/m;)V

    :cond_0
    return-void
.end method

.method public final f(Lk/l;Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Ll/u1;->F:Ll/p1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/p1;->f(Lk/l;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method
