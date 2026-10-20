.class public abstract Lea/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lea/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lea/h;->a:Lea/g;

    return-void
.end method


# virtual methods
.method public a(Lea/r;Lea/c0;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Lea/y;)V
.end method
