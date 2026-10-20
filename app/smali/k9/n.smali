.class public final Lk9/n;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Lk9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk9/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lk9/n;->a:Lk9/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
