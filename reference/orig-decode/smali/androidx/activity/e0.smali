.class public final Landroidx/activity/e0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroidx/activity/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/activity/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/activity/e0;->a:Landroidx/activity/e0;

    return-void
.end method


# virtual methods
.method public final a(Lc9/c;Lc9/c;Lc9/a;Lc9/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc9/c;",
            "Lc9/c;",
            "Lc9/a;",
            "Lc9/a;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/d0;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/activity/d0;-><init>(Lc9/c;Lc9/c;Lc9/a;Lc9/a;)V

    return-object v0
.end method
