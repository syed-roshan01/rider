.class public final Lp9/i;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Lp9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp9/i;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lp9/i;->a:Lp9/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
