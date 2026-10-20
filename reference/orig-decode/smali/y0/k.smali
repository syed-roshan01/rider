.class public final Ly0/k;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Ly0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly0/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Ly0/k;->a:Ly0/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/m;

    instance-of p1, p1, Ly0/j;

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
