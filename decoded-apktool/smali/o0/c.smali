.class public final Lo0/c;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Lo0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo0/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lo0/c;->a:Lo0/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
