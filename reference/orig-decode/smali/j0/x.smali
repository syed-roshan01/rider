.class public final Lj0/x;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Lj0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj0/x;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lj0/x;->a:Lj0/x;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lj0/d;->a:Lj0/d;

    return-object v0
.end method
